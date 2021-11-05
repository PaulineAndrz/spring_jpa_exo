package com.example.spring_jpa_exo.controllers;

import com.example.spring_jpa_exo.models.Infirmier;
import com.example.spring_jpa_exo.models.Patient;
import com.example.spring_jpa_exo.services.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("patients")
@CrossOrigin
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> findAll(){
        return this.patientService.findAll();
    }

    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        return this.patientService.create(patient);
    }

    @DeleteMapping("/{id}")
    public List<Patient> deleteById(@PathVariable Long id) {
        return this.patientService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Patient> findById(@PathVariable Long id) {
        return this.patientService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody Patient patient, @PathVariable Long id) {
        return this.patientService.update(patient, id);
    }

    @GetMapping("/{id}/infirmiers")
    public List<Infirmier> findInfirmierById(Long id) {
        return this.patientService.findInfirmierById(id);
    }

    @GetMapping("/{nom}&{prenom}")
    public List<Patient> findPatientByNomAndPrenom(@RequestParam String nom, @RequestParam String prenom) {
        return this.patientService.findPatientByNomAndPrenom(nom, prenom);
    }

}
