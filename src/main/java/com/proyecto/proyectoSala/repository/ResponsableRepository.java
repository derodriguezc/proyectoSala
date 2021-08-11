package com.proyecto.proyectoSala.repository;

import com.proyecto.proyectoSala.entity.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsableRepository extends JpaRepository<Responsable, Integer> {

    List<Responsable> findAll();
}
