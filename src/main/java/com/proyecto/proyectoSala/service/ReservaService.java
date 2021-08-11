package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Reserva;
import com.proyecto.proyectoSala.entity.Sala;

import java.util.List;

public interface ReservaService {

    List<Reserva> findAll();

    Reserva save(Reserva reserva);
}
