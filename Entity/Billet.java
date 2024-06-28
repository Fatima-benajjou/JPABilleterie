package org.example.JPABillet.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_billet")
    private int idBillet;
    private TypeBillet typeBillet;

    @ManyToOne
    @JoinColumn (name= "id_evenement")
    private Evenement evenement;

    @ManyToOne
    @JoinColumn (name= "id_client")
    private Client client;





}
