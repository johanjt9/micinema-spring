package com.servicios.cinema.services;

import com.servicios.cinema.models.entity.Sala;
import com.servicios.cinema.models.entity.Sucursal;
import com.servicios.cinema.models.repository.SalaRepository;
import com.servicios.cinema.models.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SucursalServiceImpl implements SucursalService{

    @Autowired
    private SucursalRepository sucursalRepository;
    @Override
    @Transactional(readOnly = true)
    public Iterable<Sucursal> findAll() {
        return sucursalRepository.findAll();
    }

    @Override
    public Optional<Sucursal> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Sala save(Sucursal sucursal) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
