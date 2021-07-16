package com.servicios.cinema.controllers;

import com.servicios.cinema.models.entity.Capacidad;
import com.servicios.cinema.models.entity.Sala;
import com.servicios.cinema.services.CapacidadService;
import com.servicios.cinema.services.SalaService;
import com.servicios.cinema.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SalaController {

    @Autowired
    private SalaService salaService;

    @Autowired
    private CapacidadService capacidadService;

    @Autowired
    private SucursalService sucursalService;

    @GetMapping("/salas")
    public ResponseEntity<?> listarSalas(){
        return ResponseEntity.ok().body(salaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> verDetalle(@PathVariable Long id){
        Optional<Sala> dato = salaService.findById(id);
        if (dato.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(dato.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Sala sala){
        Sala salaCreated = salaService.save(sala);
        System.out.println(sala.getCapacidads());
        return ResponseEntity.status(HttpStatus.CREATED).body(salaCreated);
    }

    @PostMapping("/capacidad")
    public ResponseEntity<?> crearCapacidad(@RequestBody Capacidad capacidad){
        System.out.println(capacidad.getNumeroFila());
        System.out.println(capacidad.getId());
        System.out.println(capacidad.getIdSala());
        System.out.println(capacidad.getNumeroSillas());
        Capacidad capacidad1 = capacidadService.save(capacidad);
        return ResponseEntity.status(HttpStatus.CREATED).body(capacidad1);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        salaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/sucursales")
    public ResponseEntity<?> listarSucursales(){
        return ResponseEntity.ok().body(sucursalService.findAll());
    }

}
