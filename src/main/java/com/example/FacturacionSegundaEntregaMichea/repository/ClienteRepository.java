package com.example.FacturacionSegundaEntregaMichea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionSegundaEntregaMichea.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    
}
