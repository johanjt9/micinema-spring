package com.servicios.cinema.services;

import com.servicios.cinema.models.entity.Capacidad;

import java.util.Optional;

public interface CapacidadService {
    public Iterable<Capacidad> findAll();

    public Optional<Capacidad> findById(Long id);

    public Capacidad save(Capacidad capacidad);

    public void deleteById(Long id);
}
