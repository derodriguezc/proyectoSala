package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Sala;

import java.util.List;

public interface SalaService {

    List<Sala> findAll();

    Sala save(Sala sala);
}
