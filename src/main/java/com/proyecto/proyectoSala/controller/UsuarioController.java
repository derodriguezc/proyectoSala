package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Usuario;
import com.proyecto.proyectoSala.service.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    //localhost:8080/usuario

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable("id") Integer id) throws Exception {
        return usuarioService.findById(id);
    }

    @GetMapping
    public  @ResponseBody
    List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    @PostMapping
    public @ResponseBody Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

}
