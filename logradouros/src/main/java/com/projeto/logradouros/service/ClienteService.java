package com.projeto.logradouros.service;

import com.projeto.logradouros.exception.ClienteNotFoundException;
import com.projeto.logradouros.model.Cliente;
import com.projeto.logradouros.model.Endereco;
import com.projeto.logradouros.repository.ClienteRepository;
import com.projeto.logradouros.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void adicionarEnderecoAoCliente(String email, Endereco endereco) throws ClienteNotFoundException {
        Cliente cliente = clienteRepository.findByEmail(email);
        if (cliente == null) {
            throw new ClienteNotFoundException("Cliente não encontrado.");
        }

        cliente.addEndereco(endereco);
        clienteRepository.save(cliente);
    }

    public List<Endereco> listarEnderecosDoCliente(String email) throws ClienteNotFoundException {
        Cliente cliente = clienteRepository.findByEmail(email);
        if (cliente == null) {
            throw new ClienteNotFoundException("Cliente não encontrado.");
        }

        return cliente.getEnderecos();
    }
}
