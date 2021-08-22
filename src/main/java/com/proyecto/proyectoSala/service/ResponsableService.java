package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Responsable;

import java.util.List;

public interface ResponsableService {

    List<Responsable> findAll();

    Responsable save(Responsable responsable);

    Responsable findById(Integer id) throws Exception;
}
