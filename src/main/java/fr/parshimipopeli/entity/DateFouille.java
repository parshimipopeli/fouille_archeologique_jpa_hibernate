package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dateDeFouille")
public class DateFouille {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @ManyToMany(mappedBy = "fouilleList")
//    @JoinTable( name = "Site_DateFouille",
//        joinColumns = @JoinColumn(name = "id_dateFouille"),
//        inverseJoinColumns = @JoinColumn(name = "id_site"))
    List<Site> listeSite = new ArrayList<>();


    public DateFouille() {
    }

    public DateFouille(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
