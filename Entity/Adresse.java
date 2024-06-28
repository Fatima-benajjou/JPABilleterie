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
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_adresse")
    private int idAdresse;
    private String rue;
    private String ville;

    @OneToOne(mappedBy = "adresse")
    private Client client;

}
