package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Rol;
import com.proyecto.proyectoSala.entity.Tipo;
import com.proyecto.proyectoSala.service.TipoServiceImpl;
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
@RequestMapping("/tipo")
public class TipoController {
    @Autowired
    private TipoServiceImpl tipoService;

    //localhost:8080/tipo

    @GetMapping("/{id}")
    public Tipo findById(@PathVariable("id") Integer id) throws Exception {
        return tipoService.findById(id);
    }

    @GetMapping
    public  @ResponseBody
    List<Tipo> findAll(){
        return tipoService.findAll();
    }

    @PostMapping
    public @ResponseBody Tipo save(@RequestBody Tipo tipo){return tipoService.save(tipo);}
}
