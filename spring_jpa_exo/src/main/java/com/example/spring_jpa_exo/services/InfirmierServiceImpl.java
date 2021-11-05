package com.example.spring_jpa_exo.services;

import com.example.spring_jpa_exo.models.Infirmier;
import com.example.spring_jpa_exo.repositories.InfirmierRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class InfirmierServiceImpl implements InfirmierService {

    private InfirmierRepository infirmierRepository;

    public InfirmierServiceImpl(InfirmierRepository infirmierRepository) {
        this.infirmierRepository = infirmierRepository;
    }

    public ResponseEntity update(Infirmier infirmier, Long id) {
        Infirmier currentInfirmier = this.infirmierRepository.findById(id).orElseThrow(RuntimeException::new);;
        currentInfirmier.setNom(infirmier.getNom());
        currentInfirmier.setPrenom(infirmier.getPrenom());
        this.create(currentInfirmier);
        return ResponseEntity.ok(currentInfirmier);
    }

    public Infirmier create(Infirmier infirmier) {
        return this.infirmierRepository.save(infirmier);
    }

    public Optional<Infirmier> getById(Long id) {
        return this.infirmierRepository.findById(id);
    }

    public List<Infirmier> findAll() {
        return this.infirmierRepository.findAll();
    }

    public List<Infirmier> deleteById(Long id) {
        this.infirmierRepository.deleteById(id);
        return this.findAll();
    }
}
