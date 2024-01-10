package fr.parshimipopeli.config;

import fr.parshimipopeli.dao.jpa.*;
import fr.parshimipopeli.entity.Parcelle;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Singleton {

    private static Singleton instance = null;
    private EntityManagerFactory emf = null;

    // Instanciation de mes DAO
    private final SiteDaoJpa siteDaoJpa = new SiteDaoJpa();
    private final ParcelleDaoJpa parcelleDaoJpa = new ParcelleDaoJpa();
    private final ObjetChercheDaoJpa objetChercheDaoJpa = new ObjetChercheDaoJpa();
    private final EtatCompletudeDaoJpa etatCompletudeDaoJpa = new EtatCompletudeDaoJpa();
    private final EquipeDaoJpa equipeDaoJpa = new EquipeDaoJpa();
    private final DateFouilleDaoJpa dateFouilleDaoJpa = new DateFouilleDaoJpa();
    private final ChercheurDaoJpa chercheurDaoJpa = new ChercheurDaoJpa();
    private final CategorieDaoJpa categorieDaoJpa = new CategorieDaoJpa();

    public Singleton() {
    }

    public Singleton(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public SiteDaoJpa getSiteDaoJpa() {
        return siteDaoJpa;
    }

    public ParcelleDaoJpa getParcelleDaoJpa() {
        return parcelleDaoJpa;
    }

    public ObjetChercheDaoJpa getObjetChercheDaoJpa() {
        return objetChercheDaoJpa;
    }

    public EtatCompletudeDaoJpa getEtatCompletudeDaoJpa() {
        return etatCompletudeDaoJpa;
    }

    public EquipeDaoJpa getEquipeDaoJpa() {
        return equipeDaoJpa;
    }

    public DateFouilleDaoJpa getDateFouilleDaoJpa() {
        return dateFouilleDaoJpa;
    }

    public ChercheurDaoJpa getChercheurDaoJpa() {
        return chercheurDaoJpa;
    }

    public CategorieDaoJpa getCategorieDaoJpa() {
        return categorieDaoJpa;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public EntityManagerFactory getEmf(String persistenceUnitName) {
        if (this.emf == null) {
            this.emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        }
        return this.emf;
    }
}

