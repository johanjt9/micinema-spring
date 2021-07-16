package com.servicios.cinema.services;

import com.servicios.cinema.models.entity.Sala;
import com.servicios.cinema.models.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SalaServiceImpl implements SalaService{

    @Autowired
    private SalaRepository salaRepository;
    @Override
    @Transactional(readOnly = true)
    public Iterable<Sala> findAll() {
        return salaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Sala> findById(Long id) {
        return salaRepository.findById(id);
    }

    @Override
    @Transactional
    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        salaRepository.deleteById(id);
    }
}
