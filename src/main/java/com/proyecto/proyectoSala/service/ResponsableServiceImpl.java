package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Responsable;
import com.proyecto.proyectoSala.repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableServiceImpl implements ResponsableService {

    @Autowired
    private ResponsableRepository responsableRepository;

    @Override
    public List<Responsable> findAll() {
        return responsableRepository.findAll();
    }

    @Override
    public Responsable save(Responsable responsable) {
        return responsableRepository.save(responsable);
    }
}
