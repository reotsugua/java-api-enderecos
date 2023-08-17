package com.projeto.logradouros.controller;

import com.projeto.logradouros.exception.ClienteNotFoundException;
import com.projeto.logradouros.exception.EnderecoNotFoundException;
import com.projeto.logradouros.model.Cliente;
import com.projeto.logradouros.model.Endereco;
import com.projeto.logradouros.repository.ClienteRepository;
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

    @Autowired
    private ClienteRepository clienteRepository;

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
        try {
            Cliente cliente = clienteRepository.findByEmail(email);

            if (cliente == null) {
                return ResponseEntity.notFound().build();
            }

            cliente.addEndereco(endereco);
            clienteRepository.save(cliente);

            return ResponseEntity.ok("Endereço adicionado com sucesso.");
        } catch (ClienteNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}

