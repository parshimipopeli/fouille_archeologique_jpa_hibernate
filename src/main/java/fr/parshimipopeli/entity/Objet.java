package fr.parshimipopeli.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "objetTrouvé")
public class Objet {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "numeroObjet")
    private Integer numero;
    @Column(name = "designationOjet")
    private String designation;
    @Column(name = "etatConservationObjet")
    private Boolean etatConservation;

    public Objet(Integer numero, String designation, Boolean etatConservation) {
        this.numero = numero;
        this.designation = designation;
        this.etatConservation = etatConservation;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Boolean getEtatConservation() {
        return etatConservation;
    }

    public void setEtatConservation(Boolean etatConservation) {
        this.etatConservation = etatConservation;
    }
}
