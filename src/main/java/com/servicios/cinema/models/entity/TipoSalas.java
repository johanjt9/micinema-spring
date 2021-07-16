package com.servicios.cinema.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_salas")
public class TipoSalas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;

    private Integer estado;

    @OneToMany(mappedBy = "tipoSalas")
    private List<Sala> salas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
