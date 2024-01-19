package com.Unicred.DemoBancoAlpha.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    private String sobrenome;

    @Column(unique = true)
    @NotBlank
    private String email;

    @NotBlank
    private String senha;

    @NotBlank
    private String endereco;

    @NotBlank
    private Integer cnpj;

    private String complemento;

    private String cidade;

    private Integer cep;

}
