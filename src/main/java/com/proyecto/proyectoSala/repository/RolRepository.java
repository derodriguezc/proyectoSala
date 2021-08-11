package com.proyecto.proyectoSala.repository;

import com.proyecto.proyectoSala.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolRepository extends JpaRepository<Rol, Integer> {

    List<Rol> findAll();
}
