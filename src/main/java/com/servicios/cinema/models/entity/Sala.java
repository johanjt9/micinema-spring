package com.servicios.cinema.models.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_sucursal")
    private Integer idSucursal;

    @Column(name = "id_tipo_sala")
    private Integer idTipoSala;

    private Integer estado;

    @Column(name = "usuario_registro")
    private Integer usuarioRegistro;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @PrePersist
    public void prePersist(){
        this.fechaRegistro = new Date();
    }

    @ManyToOne
    @JoinColumn(name = "id_sucursal", insertable = false, updatable = false)
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "id_tipo_sala", insertable = false, updatable = false)
    private TipoSalas tipoSalas;

    @OneToMany(mappedBy = "sala")
    private List<Capacidad> capacidads;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Integer getIdTipoSala() {
        return idTipoSala;
    }

    public void setIdTipoSala(Integer idTipoSala) {
        this.idTipoSala = idTipoSala;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Integer usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Capacidad> getCapacidads() {
        return capacidads;
    }

    public void setCapacidads(List<Capacidad> capacidads) {
        this.capacidads = capacidads;
    }

    public TipoSalas getTipoSalas() {
        return tipoSalas;
    }

    public void setTipoSalas(TipoSalas tipoSalas) {
        this.tipoSalas = tipoSalas;
    }
}
