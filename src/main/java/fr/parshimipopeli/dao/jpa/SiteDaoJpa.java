package fr.parshimipopeli.dao.jpa;

import fr.parshimipopeli.config.Singleton;
import fr.parshimipopeli.dao.Dao;
import fr.parshimipopeli.entity.Site;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class SiteDaoJpa implements Dao<Site, Long> {

    /**
     * Methode pour récupérer tous les élements
     * du stockage
     *
     * @return List d'objet
     */
    @Override
    public List<Site> findAll() {

        List<Site> sites = new ArrayList<>();
        EntityManager em = null;
        EntityTransaction tx = null;

        try {
            em = Singleton
                    .getInstance()
                    .getEmf("archeology-jpa")
                    .createEntityManager();
            tx = em.getTransaction();
            tx.begin();
            TypedQuery<Site> query = em
                    .createQuery("SELECT sit FROM Site sit", Site.class);
            // Recuperer mes resultats de requete
            sites = query.getResultList();
            // Envoie et valide la communication
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return sites;
    }

    /**
     * Methode pour récuperer un élement spécifique à partir de sa clé primaire
     *
     * @param id@return obj, l'élement recherché
     */
    @Override
    public Site findByid(Long id) {
        return null;
    }

    /**
     * Methode pour enregistrer un nouvel element dans mon stockage
     *
     * @param newObj@return newObj avec un id generer par la bbase de donnée
     */
    @Override
    public Site create(Site newObj) {

        Site site = null;
        EntityManager em = null;
        EntityTransaction tx = null;

        try {
            em = Singleton
                    .getInstance()
                    .getEmf("archeology-jpa")
                    .createEntityManager();
            tx = em.getTransaction();
            tx.begin();
            // Recuperer mon resultats de requete
            site = em.merge(newObj);
            // Envoie et valide la communication
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return site;
    }

    /**
     * Methode pour modifier un élément dans mon stockage à partir de son id
     *
     * @param site
     */
    @Override
    public void update(Site site) {

    }

    /**
     * Methode pour supprimer un objet de mon stockage à partir de son id
     *
     * @param id
     * @return objet supprimer
     */
    @Override
    public Site delete(Long id) {
        return null;
    }
}