package com.example.spring_jpa_exo.services;

import com.example.spring_jpa_exo.models.Adresse;
import com.example.spring_jpa_exo.repositories.AdresseRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public ResponseEntity update(Adresse adresse, Long id) {
        Adresse currentAdresse = this.getById(id).orElseThrow(RuntimeException::new);
        currentAdresse.setNumero(adresse.getNumero());
        currentAdresse.setRue(adresse.getRue());
        currentAdresse.setVille(adresse.getVille());
        currentAdresse.setCodePostal(adresse.getCodePostal());
        this.create(currentAdresse);
        return ResponseEntity.ok(currentAdresse);
    }

    public Adresse create(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    public Optional<Adresse> getById(Long id) {
        return this.adresseRepository.findById(id);
    }

    public List<Adresse> findAll() {
        return this.adresseRepository.findAll();
    }

    public List<Adresse> deleteById(Long id) {
        this.adresseRepository.deleteById(id);
        return this.findAll();
    }

    public List<Adresse> findByVille(String ville) {
        return this.adresseRepository.findByVille(ville);
    }

}
