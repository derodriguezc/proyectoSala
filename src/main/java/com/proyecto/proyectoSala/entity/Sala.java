package com.proyecto.proyectoSala.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@ApiModel(description = "Información o propiedades de la Sala")
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @Column(name = "id_sala")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idSala;

    @ApiModelProperty(notes = "Nombre dene tener como minimo 3 caracteres")
    @Size(min = 3, max = 50, message = "El nombre debe contener mínimo 3 caracteres")
    @Column(name = "nombre_sala", nullable = true, length = 50)
    private String nombre_sala;

    @ApiModelProperty(notes = "La ubicacion_sala debe tener máximo 200 caracteres")
    @Size(max = 200, message = "La ubicacion_sala debe tener máximo 200 caracteres")
    @Column(name = "ubicacion_sala", nullable = true, length = 200)
    private String ubicacion_sala;

    @ApiModelProperty(notes = "Solo existen 6 tipos de sala")
    @Column(name = "tipo", nullable = true)
    private String tipo;

    @ApiModelProperty(notes = "Estado solo puede ser true o false")
    @Column(name = "estado", nullable = true)
    private String estado;

    @ApiModelProperty(notes = "responsable_sala dene tener como minimo 5 caracteres")
    @Size(min = 5, max = 50, message = "El responsable_sala debe contener mínimo 5 caracteres")
    @Column(name = "responsable_sala", nullable = true, length = 50)
    private String responsable_sala;

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
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
