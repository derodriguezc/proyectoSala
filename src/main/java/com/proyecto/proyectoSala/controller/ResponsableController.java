package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Responsable;
import com.proyecto.proyectoSala.service.ResponsableServiceImpl;
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
@RequestMapping("/responsable")
public class ResponsableController {

    @Autowired
    private ResponsableServiceImpl responsableService;

    //localhost:8080/responsable

    @GetMapping("/{id}")
    public Responsable findById(@PathVariable("id") Integer id) throws Exception {
        return responsableService.findById(id);
    }

    @GetMapping
    public  @ResponseBody
    List<Responsable> findAll(){
        return responsableService.findAll();
    }
    @PostMapping
    public @ResponseBody Responsable save(@RequestBody Responsable responsable){return responsableService.save(responsable);}

}
