package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaController {

    @Autowired
    private SalaService salaService;

    //localhost:8080/sala
    @GetMapping public  @ResponseBody List<Sala> findAll(){
        return salaService.findAll();
    }
    @PostMapping
    public @ResponseBody Sala save(@RequestBody Sala sala){
        return salaService.save(sala);
    }

}
