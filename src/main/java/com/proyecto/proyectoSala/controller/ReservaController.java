package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.dto.ReservaDTO;
import com.proyecto.proyectoSala.entity.Reserva;
import com.proyecto.proyectoSala.service.impl.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

        @Autowired
        private ReservaServiceImpl reservaService;

        //localhost:8080/reserva

        @GetMapping("/{id}")
        public Reserva findById(@PathVariable("id") Integer id) throws Exception {
                return reservaService.findById(id);
        }

        @GetMapping
        public  @ResponseBody
        List<Reserva> findAll(){
            return reservaService.findAll();
        }
        @PostMapping
        public @ResponseBody Reserva save(@RequestBody Reserva reserva){
            return reservaService.save(reserva);
        }

        @GetMapping("/dto")
        public List<ReservaDTO> findAllReservas(){
                return reservaService.findAllReservas();
        }

}
