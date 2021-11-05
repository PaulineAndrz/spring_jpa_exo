package com.example.spring_jpa_exo.repositories;

import com.example.spring_jpa_exo.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    public List<Adresse> findByVille(String ville);
}
