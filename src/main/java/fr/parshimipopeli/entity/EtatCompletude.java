package fr.parshimipopeli.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "etatCompletudeObjet")
public class EtatCompletude {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "etat")
    private String etat;

    public EtatCompletude() {
    }

    public EtatCompletude(Long id, String etat) {
        this.id = id;
        this.etat = etat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
