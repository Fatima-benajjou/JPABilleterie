package org.example.JPABillet.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evenement")
    private int idEvent;
    private String nom;
    private Date date;
    private int nbPlace;

    @OneToOne
    @JoinColumn (name= "id_adresse")
    private Adresse adresse;

    @OneToMany(mappedBy = "evenement")
    private List<Billet> billets;



}
