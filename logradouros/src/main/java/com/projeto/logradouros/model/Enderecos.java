package com.projeto.logradouros.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Enderecos {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
