package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Responsable;
import com.proyecto.proyectoSala.entity.Tipo;

import java.util.List;

public interface TipoService {
    List<Tipo> findAll();

    Tipo save(Tipo tipo);

    Tipo findById(Integer id) throws Exception;
}
