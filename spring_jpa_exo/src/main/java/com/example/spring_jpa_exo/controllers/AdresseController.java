package com.example.spring_jpa_exo.controllers;

import com.example.spring_jpa_exo.models.Adresse;
import com.example.spring_jpa_exo.services.AdresseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("adresses")
@CrossOrigin
public class AdresseController {
    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @GetMapping
    public List<Adresse> findAll(){
        return this.adresseService.findAll();
    }

    @PostMapping
    public Adresse create(@RequestBody Adresse adresse) {
        return this.adresseService.create(adresse);
    }

    @DeleteMapping("/{id}")
    public List<Adresse> deleteById(@PathVariable Long id) {
        return this.adresseService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Adresse> findById(@PathVariable Long id) {
        return this.adresseService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody Adresse adresse, @PathVariable Long id) {
        return this.adresseService.update(adresse, id);
    }

    @GetMapping("/{ville}")
    public List<Adresse> findByVille(@RequestParam(required = false) String ville) {
        return this.adresseService.findByVille(ville);
    }
}
