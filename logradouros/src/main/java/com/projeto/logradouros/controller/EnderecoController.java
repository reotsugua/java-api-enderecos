package com.projeto.logradouros.controller;

import com.projeto.logradouros.model.Endereco;
import com.projeto.logradouros.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class EnderecoController {
    @Autowired
    private ViaCepService viaCepService; // Você precisará criar esse serviço

    @GetMapping("/endereco/{cep}")
    public ResponseEntity<?> buscarEnderecoPorCep(@PathVariable String cep) {
        try {
            Endereco endereco = viaCepService.buscarEnderecoPorCep(cep);
            return ResponseEntity.ok(endereco);
        } catch (EnderecoNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/cliente/{email}/endereco")
    public ResponseEntity<?> adicionarEnderecoAoCliente(@PathVariable String email, @RequestBody Endereco endereco) {
        // Encontre o cliente pelo email usando um serviço ou repositório.
        // Associe o endereço ao cliente e salve no banco de dados.
        // Retorne uma mensagem de sucesso.
    }
}

