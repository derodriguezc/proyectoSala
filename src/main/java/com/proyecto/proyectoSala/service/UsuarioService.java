package com.proyecto.proyectoSala.service;

import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.entity.Usuario;

import java.util.List;

public interface UsuarioService  {
    List<Usuario> findAll();

    Usuario save(Usuario usuario);
}
