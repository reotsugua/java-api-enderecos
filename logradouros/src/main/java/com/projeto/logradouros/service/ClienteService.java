package com.projeto.logradouros.service;

import com.projeto.logradouros.model.Endereco;
import com.projeto.logradouros.repository.ClienteRepository;
import com.projeto.logradouros.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository; // Você precisará criar esse repositório

    @Autowired
    private EnderecoRepository enderecoRepository; // Você já criou esse repositório

    public void adicionarEnderecoAoCliente(String email, Endereco endereco) throws ClienteNotFoundException {
        // Implemente a lógica para encontrar o cliente pelo email, associar o endereço a ele e salvar no banco de dados.
        // Trate os casos de erro conforme necessário.
    }

    public List<Endereco> listarEnderecosDoCliente(String email) throws ClienteNotFoundException {
        // Implemente a lógica para encontrar o cliente pelo email e retornar a lista de endereços associados a ele.
        // Trate os casos de erro conforme necessário.
    }
}
