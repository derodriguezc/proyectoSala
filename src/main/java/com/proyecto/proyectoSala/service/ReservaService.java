package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Reserva;

import java.util.List;

public interface ReservaService {

    Reserva findById(Integer id) throws Exception;

    List<Reserva> findAll();

    Reserva save(Reserva reserva);
}
