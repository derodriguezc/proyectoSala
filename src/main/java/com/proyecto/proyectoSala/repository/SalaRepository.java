package com.proyecto.proyectoSala.repository;

import com.proyecto.proyectoSala.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Integer> {

    List<Sala> findAll();

}
