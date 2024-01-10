package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "siteFouille")
public class Site {

    @Id
    @GeneratedValue
    private Long site_id;
    @Column(name = "villeProche")
    private String ville;

    private List<Parcelle> parcelleList = new ArrayList<>();

    public Site() {
    }

    public Site(Long site_id, String ville, List<Parcelle> parcelleList) {
        this.site_id = site_id;
        this.ville = ville;
        this.parcelleList = parcelleList;
    }

    public Long getSite_id() {
        return site_id;
    }

    public void setSite_id(Long site_id) {
        this.site_id = site_id;
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
