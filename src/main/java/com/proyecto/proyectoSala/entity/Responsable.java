package com.proyecto.proyectoSala.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@ApiModel(description = "Información o propiedades del Responsable")
@Entity
@Table(name = "responsable")
public class Responsable {

    @Id
    @Column(name = "id_responsable")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

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
    @Column(name = "telefono", nullable = true, length = 9)
    private Integer telefono;


    //No me permite guardar el respnsbale ya que me da un error de
   /* {
        "timestamp": "2021-08-28T17:40:56.604",
            "mensaje": "Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction",
            "detalles": "uri=/responsable"
    }*/


    //@ManyToOne
    //@JoinColumn(name = "id_sala", nullable = false, foreignKey = @ForeignKey(name = "FK_responsable_sala"))
    //private Sala sala;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
