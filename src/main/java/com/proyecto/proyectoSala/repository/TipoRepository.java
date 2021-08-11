package com.proyecto.proyectoSala.repository;

import com.proyecto.proyectoSala.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoRepository extends JpaRepository<Tipo, Integer> {

    List<Tipo> findAll();
}
