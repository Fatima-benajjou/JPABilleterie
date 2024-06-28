package org.example.JPABillet.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;
    private String nom;
    private String prenom;
    private int age;
    private int numTel;



    @OneToMany (mappedBy = "client")
    List<Billet> billets;


    @OneToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresse;

}
