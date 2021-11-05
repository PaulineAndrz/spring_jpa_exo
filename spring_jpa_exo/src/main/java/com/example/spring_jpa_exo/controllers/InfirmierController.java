package com.example.spring_jpa_exo.controllers;

import com.example.spring_jpa_exo.models.Infirmier;
import com.example.spring_jpa_exo.services.InfirmierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("infirmiers")
@CrossOrigin
public class InfirmierController {

    private InfirmierService infirmierService;

    public InfirmierController(InfirmierService infirmierService) {
        this.infirmierService = infirmierService;
    }

    @GetMapping
    public List<Infirmier> findAll(){
        return this.infirmierService.findAll();
    }

    @PostMapping
    public Infirmier create(@RequestBody Infirmier infirmier) {
        return this.infirmierService.create(infirmier);
    }

    @DeleteMapping("/{id}")
    public List<Infirmier> deleteById(@PathVariable Long id) {
        return this.infirmierService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Infirmier> findById(@PathVariable Long id) {
        return this.infirmierService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody Infirmier infirmier, @PathVariable Long id) {
        return this.infirmierService.update(infirmier, id);
    }
}
