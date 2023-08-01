package br.com.gestao.venda.modelo.dominio;

import java.time.LocalDate;

public class Usuario {
    
    private Long id;
    private String nome;
    private String senha;    
    private String usuairo;
    private Perfil perfil;
    private boolean  estado;
    private LocalDateDateTime dataHoraCriacao;
    private LocalDateDateTime ultimoLogin;
}
