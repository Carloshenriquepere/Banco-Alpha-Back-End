package com.Unicred.DemoBancoAlpha.service;


import com.Unicred.DemoBancoAlpha.entities.Usuario;
import com.Unicred.DemoBancoAlpha.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return this.usuariosRepository.save(usuario);
    }

    public List<Usuario> buscarTodos() {
        return this.usuariosRepository.findAll();
    }

    public List<Usuario> buscarPorId(Integer id){
        return this.usuariosRepository.findAllById(Collections.singleton(id));
    }

    public Optional<Usuario> findByEmail(String email) {
        return this.usuariosRepository.findByEmail(email);
    }

    public List<Usuario> buscarPorLogin(String email) {
        return this.usuariosRepository.findAll()
                .stream()
                .filter(usuario -> usuario.getEmail().equalsIgnoreCase(email))
                .collect(Collectors.toList());
    }
}
