package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Sala;

import java.util.List;

public interface SalaService {

    Sala findById(Integer id) throws Exception;

    List<Sala> findAll();

    Sala save(Sala sala);
}
