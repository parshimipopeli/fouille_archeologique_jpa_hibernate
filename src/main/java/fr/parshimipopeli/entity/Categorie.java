package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorieObjet")
public class Categorie {

    @Id
    @GeneratedValue
    private Long id_categorie;
    @Column(name = "categorie")
    private String categorie;

    @OneToMany
    private List<ObjetCherche> listObjet = new ArrayList<>();

    public Categorie() {
    }

    public Categorie(String categorie) {
        this.categorie = categorie;
    }

    public Long getId() {
        return id_categorie;
    }

    public void setId(Long id) {
        this.id_categorie = id;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

}
