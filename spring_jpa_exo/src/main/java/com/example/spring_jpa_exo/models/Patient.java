package com.example.spring_jpa_exo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String sexe;
    private BigInteger numeroSecuriteSociale;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    private Adresse adresse;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "infirmier_id", referencedColumnName = "id")
    private Infirmier infirmier;

}
