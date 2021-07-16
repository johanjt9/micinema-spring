package com.servicios.cinema.services;

import com.servicios.cinema.models.entity.Sala;
import com.servicios.cinema.models.entity.Sucursal;

import java.util.Optional;

public interface SucursalService {
    public Iterable<Sucursal> findAll();

    public Optional<Sucursal> findById(Long id);

    public Sala save(Sucursal sucursal);

    public void deleteById(Long id);
}
