package com.example.spring_jpa_exo.services;

import com.example.spring_jpa_exo.models.Infirmier;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface InfirmierService {
    ResponseEntity update(Infirmier infirmier, Long id);
    Infirmier create(Infirmier infirmier);
    Optional<Infirmier> getById(Long id);
    List<Infirmier> findAll();
    List<Infirmier> deleteById(Long id);

    // adresses/1/patients/1/infirmiers
}
