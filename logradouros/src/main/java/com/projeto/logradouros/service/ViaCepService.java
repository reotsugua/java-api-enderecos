package com.projeto.logradouros.service;

import com.projeto.logradouros.exception.EnderecoNotFoundException;
import com.projeto.logradouros.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {
    @Autowired
    private RestTemplate restTemplate;

    public Endereco buscarEnderecoPorCep(String cep) throws EnderecoNotFoundException {
        String viaCepUrl = "https://viacep.com.br/ws/" + cep + "/json/";
        Endereco endereco = restTemplate.getForObject(viaCepUrl, Endereco.class);

        if (endereco == null || endereco.getCep() == null) {
            throw new EnderecoNotFoundException("Endereço não encontrado para o CEP fornecido.");
        }

        return endereco;
    }
}
