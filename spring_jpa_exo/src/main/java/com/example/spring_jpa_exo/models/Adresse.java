package com.example.spring_jpa_exo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private String rue;
    private String codePostal;
    private String ville;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "patients_id", referencedColumnName = "id")
    private List<Patient> patients;
}
