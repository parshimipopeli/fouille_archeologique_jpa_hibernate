package fr.parshimipopeli.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "objetTrouvé")
public class ObjetCherche {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "numeroObjet")
    private Integer numero;
    @Column(name = "designationOjet")
    private String designation;
    @Column(name = "etatConservation")
    private Boolean aRestaurer;
    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorieObjet;

    public ObjetCherche() {
    }

    public ObjetCherche(Integer numero, String designation, Boolean aRestaurer) {
        this.numero = numero;
        this.designation = designation;
        this.aRestaurer = aRestaurer;
    }

    public ObjetCherche(Long id, Integer numero, String designation, Boolean aRestaurer, Categorie categorieObjet) {
        this.id = id;
        this.numero = numero;
        this.designation = designation;
        this.aRestaurer = aRestaurer;
        this.categorieObjet = categorieObjet;
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
        return aRestaurer;
    }

    public void setEtatConservation(Boolean aRestaurer) {
        this.aRestaurer = aRestaurer;
    }
}
