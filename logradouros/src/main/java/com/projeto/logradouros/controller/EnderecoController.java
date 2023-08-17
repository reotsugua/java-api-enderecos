package com.projeto.logradouros.controller;

import com.projeto.logradouros.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/api")
public class EnderecoController {

    @GetMapping("/{cep}")
    public ResponseEntity<?> buscarEnderecoPorCep(@PathVariable String cep) {
        String apiUrl = "https://viacep.com.br/ws/" + cep + "/json/";
        Endereco address = restTemplate.getForObject(apiUrl, Endereco.class);
        return address;
    }
}
