package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "equipeChercheur")
public class Equipe extends Personne {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nomEquipe")
    private String nomE;

    private List<Personne> equipe = new ArrayList<>();

    public Equipe(String nom, String prenom, boolean directeur) {
        super(nom, prenom, directeur);
    }

    public Equipe(String nom, String prenom, boolean status, String nomE, List<Personne> equipe) {
        super(nom, prenom, status);
        this.nomE = nomE;
        this.equipe = equipe;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public List<Personne> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Personne> equipe) {
        this.equipe = equipe;
    }
}

