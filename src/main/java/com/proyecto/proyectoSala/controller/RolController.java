package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Rol;
import com.proyecto.proyectoSala.service.RolServiceImpl;
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
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolServiceImpl rolService;

    //localhost:8080/rol

    @GetMapping("/{id}")
    public Rol findById(@PathVariable("id") Integer id) throws Exception {
        return rolService.findById(id);
    }
    @GetMapping
    public  @ResponseBody
    List<Rol> findAll(){
        return rolService.findAll();
    }

    @PostMapping
    public @ResponseBody Rol save(@RequestBody Rol rol){
        return rolService.save(rol);
    }

}
