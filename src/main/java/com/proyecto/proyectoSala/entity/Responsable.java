package com.proyecto.proyectoSala.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.List;

@ApiModel(description = "Información o propiedades del Responsable")
@Entity
@Table(name = "responsable")
public class Responsable {

    @Id
    @Column(name = "id_responsable")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idResponsable;

    @ApiModelProperty(notes = "Nombre dene tener como minimo 3 caracteres")
    @Size(min = 3, max = 50, message = "El nombre debe contener mínimo 3 caracteres")
    @Column(name = "nombre", nullable = true, length = 50)
    private String nombre;

    @ApiModelProperty(notes = "Email dene tener como minimo 8 caracteres")
    @Size(min = 8, max = 50, message = "El Email debe contener mínimo 8 caracteres")
    @Column(name = "email", nullable = true, length = 50)
    private String email;

    @ApiModelProperty(notes = "El telefono no debe ser mayor ni menor de 9")
    @Size(min = 9, max = 9, message = "El telefono no debe ser mayor ni menor de 9")
    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @ManyToMany
    @JoinTable(
            name = "responsable_sala",
            joinColumns = @JoinColumn(name = "id_sala"),
            inverseJoinColumns = @JoinColumn(name = "id_responsable"))
    private List<Sala> salas;

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
