package com.Unicred.DemoBancoAlpha.service;


import com.Unicred.DemoBancoAlpha.entities.Usuario;
import com.Unicred.DemoBancoAlpha.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public Optional<Usuario> findByEmail(String email) {
        return this.usuariosRepository.findByEmail(email);
    }
}
