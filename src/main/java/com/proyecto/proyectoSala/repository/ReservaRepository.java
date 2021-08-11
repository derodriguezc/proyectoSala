package com.proyecto.proyectoSala.repository;

import com.proyecto.proyectoSala.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    List<Reserva> findAll();
}
