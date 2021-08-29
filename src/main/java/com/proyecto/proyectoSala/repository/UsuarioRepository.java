package com.proyecto.proyectoSala.repository;

import com.proyecto.proyectoSala.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findAll();

    Usuario findOneByUserName(String username);
}
