package com.proyecto.proyectoSala.dto;

public class SalaDTO {

    private String nombre_sala;
    private String ubicacion_sala;
    private String tipo;
    private String estado;
    private String responsable_sala;

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
