package com.servicios.cinema.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "capacidad")
public class Capacidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_sala")
    private Integer idSala;

    @Column(name = "numero_fila")
    private Integer numeroFila;

    @Column(name = "numero_sillas")
    private Integer numeroSillas;

    @ManyToOne
    @JoinColumn(name = "id_sala", insertable = false, updatable = false)
    private Sala sala;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Integer getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(Integer numeroFila) {
        this.numeroFila = numeroFila;
    }

    public Integer getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(Integer numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

}
