package fr.parshimipopeli.dao.jpa;

import fr.parshimipopeli.config.Singleton;
import fr.parshimipopeli.dao.Dao;
import fr.parshimipopeli.entity.Site;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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
        return null;
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
        return null;
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