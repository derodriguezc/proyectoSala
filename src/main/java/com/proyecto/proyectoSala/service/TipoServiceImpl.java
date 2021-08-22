package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Tipo;
import com.proyecto.proyectoSala.exception.ModeloNotFoundException;
import com.proyecto.proyectoSala.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoServiceImpl implements TipoService {

    @Autowired
    private TipoRepository tipoRepository;

    @Override
    public Tipo findById(Integer id) throws Exception {
        Optional<Tipo> optionalTipo = tipoRepository.findById(id);
        if(!optionalTipo.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalTipo.get();
    }

    @Override
    public List<Tipo> findAll() {
        return tipoRepository.findAll();
    }

    @Override
    public Tipo save(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

}
