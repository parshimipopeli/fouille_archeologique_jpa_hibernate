package fr.parshimipopeli.dao;

import java.util.List;

public interface Dao<TypeObj, PK> {

        /**
         * Methode pour récupérer tous les élements
         * du stockage
         * @return List d'objet
         */
        List<TypeObj> findAll();

        /**
         * Methode pour récuperer un élement spécifique à partir de sa clé primaire
         * @param id, clé primaire de l'élement
         * @return obj, l'élement recherché
         */
        TypeObj findByid(PK id);

        /**
         * Methode pour enregistrer un nouvel element dans mon stockage
         * @param newObj, un objet à enregistrer
         * @return newObj avec un id generer par la bbase de donnée
         */
        TypeObj create(TypeObj newObj);

    /**
     *  Methode pour modifier un élément dans mon stockage à partir de son id
     * @param obj, objet à modifier
     */
    void update(TypeObj obj);

    /**
     * Methode pour supprimer un objet de mon stockage à partir de son id
     * @param id
     * @return objet supprimer
     */
        TypeObj delete(PK id);
}
