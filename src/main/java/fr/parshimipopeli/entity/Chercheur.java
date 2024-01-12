package fr.parshimipopeli.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personnel")
public class Chercheur {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nomPersonne")
    private String nom;
    @Column(name = "prenomPersonne")
    private String prenom;

    @Column(name = "directeurPersonne")
    private boolean directeur;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipeChecheur;

    public Chercheur() {
    }

    public Chercheur(String nom, String prenom, boolean directeur) {
        this.nom = nom;
        this.prenom = prenom;
        this.directeur = directeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isDirecteur() {
        return directeur;
    }

    public void setDirecteur(boolean directeur) {
        this.directeur = directeur;
    }

}
