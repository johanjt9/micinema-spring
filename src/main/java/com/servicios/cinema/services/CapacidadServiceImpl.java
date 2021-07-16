package com.servicios.cinema.services;

import com.servicios.cinema.models.entity.Capacidad;
import com.servicios.cinema.models.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CapacidadServiceImpl implements CapacidadService{

    @Autowired
    private CapacidadService capacidadService;

    @Transactional(readOnly = true)
    @Override
    public Iterable<Capacidad> findAll() {
        return capacidadService.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Capacidad> findById(Long id) {
        return capacidadService.findById(id);
    }

    @Override
    @Transactional
    public Capacidad save(Capacidad capacidad) {
        return capacidadService.save(capacidad);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        capacidadService.deleteById(id);
    }
}
