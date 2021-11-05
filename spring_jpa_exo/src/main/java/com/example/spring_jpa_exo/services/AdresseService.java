package com.example.spring_jpa_exo.services;

import com.example.spring_jpa_exo.models.Adresse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    ResponseEntity update(Adresse adresse, Long id);
    Adresse create(Adresse adresse);
    Optional<Adresse> getById(Long id);
    List<Adresse> findAll();
    List<Adresse> deleteById(Long id);
    List<Adresse> findByVille(String ville);
}
