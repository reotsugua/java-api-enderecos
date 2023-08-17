package com.projeto.logradouros.repository;

import com.projeto.logradouros.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByEmail(String email);
}
