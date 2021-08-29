package com.proyecto.proyectoSala.service.impl;

import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.exception.ModeloNotFoundException;
import com.proyecto.proyectoSala.repository.SalaRepository;
import com.proyecto.proyectoSala.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaServiceImpl implements SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public Sala findById(Integer id) throws Exception {
        Optional<Sala> optionalSala = salaRepository.findById(id);
        if(!optionalSala.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalSala.get();
    }

    @Override
    public List<Sala> findAll() {
        return salaRepository.findAll();
    }

    @Override
    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }

}
