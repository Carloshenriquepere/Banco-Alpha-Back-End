package com.Unicred.DemoBancoAlpha.controller;

import com.Unicred.DemoBancoAlpha.entities.Usuario;
import com.Unicred.DemoBancoAlpha.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/todos")
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        return ResponseEntity.ok(usuarioService.salvarUsuario(usuario));
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean>  validarSenha(@RequestParam String email, @RequestParam String senha){


        Optional<Usuario> optUsuario = usuarioService.findByEmail(email);
        if(optUsuario.isEmpty()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }

        boolean valid = false;

        Usuario usuario = optUsuario.get();
        valid = encoder.matches(senha, usuario.getSenha());

        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;

        return ResponseEntity.status(status).body(valid);
    }
}
