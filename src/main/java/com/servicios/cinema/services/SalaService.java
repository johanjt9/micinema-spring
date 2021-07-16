package com.servicios.cinema.services;

import com.servicios.cinema.models.entity.Sala;

import java.util.Optional;

public interface SalaService {

    public Iterable<Sala> findAll();

    public Optional<Sala> findById(Long id);

    public Sala save(Sala sala);

    public void deleteById(Long id);
}
