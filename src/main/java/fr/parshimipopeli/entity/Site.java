package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "siteFouille")
public class Site {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "villeProche")
    private String ville;

    private List<Parcelle> parcelleList = new ArrayList<>();

    public Site() {
    }

    public Site(Long id, String ville, List<Parcelle> parcelleList) {
        this.id = id;
        this.ville = ville;
        this.parcelleList = parcelleList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Parcelle> getParcelleList() {
        return parcelleList;
    }

    public void setParcelleList(List<Parcelle> parcelleList) {
        this.parcelleList = parcelleList;
    }
}
