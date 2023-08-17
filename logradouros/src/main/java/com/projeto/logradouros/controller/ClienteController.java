package com.projeto.logradouros.controller;

import com.projeto.logradouros.exception.ClienteNotFoundException;
import com.projeto.logradouros.model.Endereco;
import com.projeto.logradouros.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{email}/listarendereco")
    public ResponseEntity<?> listarEnderecosDoCliente(@PathVariable String email) {
        try {
            List<Endereco> enderecos = clienteService.listarEnderecosDoCliente(email);
            return ResponseEntity.ok(enderecos);
        } catch (ClienteNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
