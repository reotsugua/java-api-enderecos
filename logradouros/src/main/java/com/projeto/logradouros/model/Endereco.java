package com.projeto.logradouros.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String logradouro;
    private String numero;
    private String bairro;
    private String localidade;
    private String uf;
    private String cep;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
