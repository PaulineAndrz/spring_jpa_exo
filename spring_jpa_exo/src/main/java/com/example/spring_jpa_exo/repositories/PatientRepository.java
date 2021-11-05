package com.example.spring_jpa_exo.repositories;

import com.example.spring_jpa_exo.models.Infirmier;
import com.example.spring_jpa_exo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    public List<Infirmier> findInfirmierById(Long id);
    public List<Patient> findPatientByNomAndPrenom(String nom, String prenom);
}
