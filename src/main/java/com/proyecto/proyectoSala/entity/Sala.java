package com.proyecto.proyectoSala.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @Column(name = "id_sala")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nombre_sala")
    private String nombre_sala;

    @Column(name = "ubicacion_sala")
    private String ubicacion_sala;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "estado")
    private String estado;

    @Column(name = "responsable_sala")
    private String responsable_sala;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_sala() {
        return nombre_sala;
    }

    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }

    public String getUbicacion_sala() {
        return ubicacion_sala;
    }

    public void setUbicacion_sala(String ubicacion_sala) {
        this.ubicacion_sala = ubicacion_sala;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResponsable_sala() {
        return responsable_sala;
    }

    public void setResponsable_sala(String responsable_sala) {
        this.responsable_sala = responsable_sala;
    }
}
