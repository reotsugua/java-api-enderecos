package com.projeto.logradouros.controller;

import com.projeto.logradouros.model.Enderecos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

public class EnderecosController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{cep}")
    public Enderecos getAddressByCep(@PathVariable String cep) {
        String apiUrl = "https://viacep.com.br/ws/" + cep + "/json/";
        Enderecos address = restTemplate.getForObject(apiUrl, Enderecos.class);
        return address;
    }
}
