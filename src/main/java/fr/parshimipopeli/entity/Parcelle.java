package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.StringJoiner;

@Entity
@Table
public class Parcelle {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "numeroParcelle")
    private Integer numero;
    @Column(name = "longueurParcelle")
    private Float longueur;
    @Column(name = "largeurParcelle")
    private Float largeur;

    @ManyToOne @JoinColumn(name = "site_id")
    private Site site;

    public Parcelle() {
    }

    public Parcelle(Integer numero, Float longueur, Float largeur) {
        this.numero = numero;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getLongueur() {
        return longueur;
    }

    public void setLongueur(Float longueur) {
        this.longueur = longueur;
    }

    public Float getLargeur() {
        return largeur;
    }

    public void setLargeur(Float largeur) {
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Parcelle.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("numero=" + numero)
                .add("longueur=" + longueur)
                .add("largeur=" + largeur)
                .add("site=" + site)
                .toString();
    }
}
