package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Reserva;
import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.service.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
        @GetMapping
        public  @ResponseBody
        List<Reserva> findAll(){
            return reservaService.findAll();
        }
        @PostMapping
        public @ResponseBody Reserva save(@RequestBody Reserva reserva){
            return reservaService.save(reserva);
        }
}
