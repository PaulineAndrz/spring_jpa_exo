package com.example.spring_jpa_exo.services;

import com.example.spring_jpa_exo.models.Infirmier;
import com.example.spring_jpa_exo.models.Patient;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    ResponseEntity update(Patient patient, Long id);
    Patient create(Patient patient);
    Optional<Patient> getById(Long id);
    List<Patient> findAll();
    List<Patient> deleteById(Long id);
    Infirmier findInfirmierByPatientId(Long id);
    List<Patient> findPatientByNomAndPrenom(String nom, String prenom);
}
