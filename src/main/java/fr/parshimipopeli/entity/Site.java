package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@Entity
@Table(name = "siteFouille")
public class Site {

    @Id
    @GeneratedValue
    private Long site_id;
    @Column(name = "villeProche")
    private String ville;

    @OneToMany(mappedBy = "site", fetch = FetchType.EAGER)
    private List<Parcelle> parcelleList = new ArrayList<>();

    @ManyToMany
        @JoinTable(name = "Site_DateFouille",
        joinColumns = @JoinColumn(name = "id_site"),
        inverseJoinColumns = @JoinColumn(name = "id_dateFouille"))
    private List<DateFouille> fouilleList = new ArrayList<>();

    public Site() {
    }

    public Site( String ville) {
        this.ville = ville;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", Site.class.getSimpleName() + "[", "]")
                .add("site_id=" + site_id)
                .add("ville='" + ville + "'")
                .toString();
    }
}
