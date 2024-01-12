package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "equipeChercheur")
public class Equipe {
    @Id
    @GeneratedValue
    private Long equipe_id;
    @Column(name = "nomEquipe")
    private String nomE;

    @OneToMany
    private List<Chercheur> equipe = new ArrayList<>();

    public Equipe(String nom) {
        this.nomE = nom;
    }

    public Long getEquipe_id() {
        return equipe_id;
    }

    public void setEquipe_id(Long equipe_id) {
        this.equipe_id = equipe_id;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }
}

