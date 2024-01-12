package fr.parshimipopeli;

import fr.parshimipopeli.dao.jpa.CategorieDaoJpa;
import fr.parshimipopeli.dao.jpa.SiteDaoJpa;
import fr.parshimipopeli.entity.DateFouille;
import fr.parshimipopeli.entity.Equipe;
import fr.parshimipopeli.entity.Parcelle;
import fr.parshimipopeli.entity.Site;

public class Main {
    public static void main(String[] args) {

        SiteDaoJpa site = new SiteDaoJpa();
        site.create(new Site("Lapugnoy"));

    }
}