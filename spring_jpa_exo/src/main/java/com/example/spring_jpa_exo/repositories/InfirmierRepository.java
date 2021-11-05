package com.example.spring_jpa_exo.repositories;

import com.example.spring_jpa_exo.models.Infirmier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfirmierRepository extends JpaRepository<Infirmier, Long> {
}
