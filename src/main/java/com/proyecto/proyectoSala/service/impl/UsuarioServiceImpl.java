package com.proyecto.proyectoSala.service.impl;

import com.proyecto.proyectoSala.entity.Usuario;
import com.proyecto.proyectoSala.exception.ModeloNotFoundException;
import com.proyecto.proyectoSala.repository.UsuarioRepository;
import com.proyecto.proyectoSala.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UserDetailsService, UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findOneByUserName(username);
        if(usuario == null) {
            throw new UsernameNotFoundException(String.format("Usuario no existe", username));
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        usuario.getRoles().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        });
        UserDetails ud = new User(usuario.getUserName(), usuario.getPassword(), roles);
        return ud;
    }

    @Override
    public Usuario findById(Integer id) throws Exception {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if(!optionalUsuario.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalUsuario.get();
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
