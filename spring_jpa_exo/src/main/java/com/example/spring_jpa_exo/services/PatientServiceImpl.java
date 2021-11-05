package com.example.spring_jpa_exo.services;

import com.example.spring_jpa_exo.models.Infirmier;
import com.example.spring_jpa_exo.models.Patient;
import com.example.spring_jpa_exo.repositories.PatientRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public ResponseEntity update(Patient patient, Long id) {
        Patient currentPatient = this.getById(id).orElseThrow(RuntimeException::new);
        currentPatient.setNom(patient.getNom());
        currentPatient.setPrenom(patient.getPrenom());
        currentPatient.setDateDeNaissance(patient.getDateDeNaissance());
        currentPatient.setNumeroSecuriteSociale(patient.getNumeroSecuriteSociale());
        currentPatient.setInfirmier(patient.getInfirmier());
        currentPatient.setAdresse(patient.getAdresse());
        this.create(currentPatient);
        return ResponseEntity.ok(currentPatient);
    }

    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }

    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }


    public Optional<Patient> getById(Long id) {
        return this.patientRepository.findById(id);
    }


    public List<Patient> deleteById(Long id) {
        this.patientRepository.deleteById(id);
        return this.findAll();
    }

    public List<Infirmier> findInfirmierById(Long id) {
        return this.patientRepository.findInfirmierById(id);
    }

    public List<Patient> findPatientByNomAndPrenom(String nom, String prenom) {
        return this.patientRepository.findPatientByNomAndPrenom(nom, prenom);
    }
}
