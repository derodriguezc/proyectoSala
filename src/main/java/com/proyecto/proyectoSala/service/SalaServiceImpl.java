package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServiceImpl implements SalaService{

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> findAll() {
        return salaRepository.findAll();
    }

    @Override
    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }

}
