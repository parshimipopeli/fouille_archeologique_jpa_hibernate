package fr.parshimipopeli.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorieObjet")
public class Categorie {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "categorie")
    private String categorie;

    public Categorie() {
    }

    public Categorie(String categorie) {
        this.categorie = categorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
