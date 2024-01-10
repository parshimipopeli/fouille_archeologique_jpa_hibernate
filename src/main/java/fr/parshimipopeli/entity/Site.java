package fr.parshimipopeli.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "siteFouille")
public class Site {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "villeProche")
    private String ville;

    private List<Parcelle> parcelleList = new ArrayList<>();
}
