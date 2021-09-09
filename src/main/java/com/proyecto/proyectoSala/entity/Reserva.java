package com.proyecto.proyectoSala.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "id_reserva")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idReserva;

// No muestra la fecha en la tabla, debo encontrar el formato.
    @Column(name = "fecha")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false, foreignKey = @ForeignKey(name = "FK_reserva_sala"))
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "id_responsable", nullable = false, foreignKey = @ForeignKey(name = "FK_reserva_responsable"))
    private Responsable responsable;


    @Column(name = "hora_inicio")
    private String hora_inicio;

    @Column(name = "hora_fin")
    private String hora_fin;

   @ManyToMany
   @JoinTable(
           name = "salaReserva",
           joinColumns = @JoinColumn(name = "id_sala"),
           inverseJoinColumns = @JoinColumn(name = "id_reserva"))
    private List<Sala> salas;

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
}
