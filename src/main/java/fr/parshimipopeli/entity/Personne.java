package fr.parshimipopeli.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "personnel")
public class Personne {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nomPersonne")
    private String nom;
    @Column(name = "prenomPersonne")
    private String prenom;

    @Column(name = "statusPersonne")
    private boolean status;

    public Personne(String nom, String prenom, boolean status) {
        this.nom = nom;
        this.prenom = prenom;
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
