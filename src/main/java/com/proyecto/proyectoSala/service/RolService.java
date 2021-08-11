package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Rol;

import java.util.List;

public interface RolService {

    List<Rol> findAll();

    Rol save(Rol rol);
}
