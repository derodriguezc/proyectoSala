package com.proyecto.proyectoSala.dto;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;

public class ReservaDTO extends ResourceSupport implements Serializable {

    private Integer idReserva;
    private SalaDTO salaDTO;
    private ResponsableDTO responsableDTO;

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public SalaDTO getSalaDTO() {
        return salaDTO;
    }

    public void setSalaDTO(SalaDTO salaDTO) {
        this.salaDTO = salaDTO;
    }

    public ResponsableDTO getResponsableDTO() {
        return responsableDTO;
    }

    public void setResponsableDTO(ResponsableDTO responsableDTO) {
        this.responsableDTO = responsableDTO;
    }
}
