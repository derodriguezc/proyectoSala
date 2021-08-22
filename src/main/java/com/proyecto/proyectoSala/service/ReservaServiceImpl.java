package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Reserva;
import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.exception.ModeloNotFoundException;
import com.proyecto.proyectoSala.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva findById(Integer id) throws Exception {
        Optional<Reserva> optionalReserva = reservaRepository.findById(id);
        if(!optionalReserva.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalReserva.get();
    }

    @Override
    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva save(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}
