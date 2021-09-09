package com.proyecto.proyectoSala.service.impl;

import com.proyecto.proyectoSala.dto.ReservaDTO;
import com.proyecto.proyectoSala.dto.ResponsableDTO;
import com.proyecto.proyectoSala.dto.SalaDTO;
import com.proyecto.proyectoSala.entity.Reserva;
import com.proyecto.proyectoSala.exception.ModeloNotFoundException;
import com.proyecto.proyectoSala.repository.ReservaRepository;
import com.proyecto.proyectoSala.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public List<ReservaDTO> findAllReservas() {
        List <ReservaDTO> response = new ArrayList<>();
        List<Reserva> reservas = reservaRepository.findAll();
        reservas.forEach(reserva -> {
            ReservaDTO reservaDTO = new ReservaDTO();
            reservaDTO.setIdReserva(reserva.getIdReserva());
            SalaDTO salaDTO = new SalaDTO();
            if (reserva.getSala() != null){
                salaDTO.setNombre_sala(reserva.getSala().getNombre_sala());
                salaDTO.setResponsable_sala(reserva.getSala().getResponsable_sala());
                salaDTO.setUbicacion_sala(reserva.getSala().getUbicacion_sala());
                salaDTO.setEstado(reserva.getSala().getEstado());
                salaDTO.setTipo(reserva.getSala().getTipo());

                reservaDTO.setSalaDTO(salaDTO);
            }

            if (reserva.getResponsable() != null) {
                ResponsableDTO responsableDTO = new ResponsableDTO();
                responsableDTO.setNombre(reserva.getResponsable().getNombre());
                responsableDTO.setEmail(reserva.getResponsable().getEmail());
                responsableDTO.setSalas(reserva.getResponsable().getSalas());
                responsableDTO.setTelefono(reserva.getResponsable().getTelefono());

                reservaDTO.setResponsableDTO(responsableDTO);
            }

            response.add(reservaDTO);
        });

        return response;
    }
}
