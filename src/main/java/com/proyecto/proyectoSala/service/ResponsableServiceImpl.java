package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Responsable;
import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.exception.ModeloNotFoundException;
import com.proyecto.proyectoSala.repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableServiceImpl implements ResponsableService {

    @Autowired
    private ResponsableRepository responsableRepository;

    @Override
    public Responsable findById(Integer id) throws Exception {
        Optional<Responsable> optionalResponsable = responsableRepository.findById(id);
        if(!optionalResponsable.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalResponsable.get();
    }

    @Override
    public List<Responsable> findAll() {
        return responsableRepository.findAll();
    }

    @Override
    public Responsable save(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

}
