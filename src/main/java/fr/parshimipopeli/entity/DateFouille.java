package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "dateDeFouille")
public class DateFouille {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    public DateFouille() {
    }

    public DateFouille(Long id, Date date) {
        this.id = id;
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
