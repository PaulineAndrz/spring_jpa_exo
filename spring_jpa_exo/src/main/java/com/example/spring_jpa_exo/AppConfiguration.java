package com.example.spring_jpa_exo;

import com.example.spring_jpa_exo.repositories.AdresseRepository;
import com.example.spring_jpa_exo.repositories.InfirmierRepository;
import com.example.spring_jpa_exo.repositories.PatientRepository;
import com.example.spring_jpa_exo.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public InfirmierService infirmierService(InfirmierRepository infirmierRepository) {
        return new InfirmierServiceImpl(infirmierRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository) {
        return new PatientServiceImpl(patientRepository);
    }

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository) {
        return new AdresseServiceImpl(adresseRepository);
    }
}
