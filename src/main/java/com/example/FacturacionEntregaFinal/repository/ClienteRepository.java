package com.example.FacturacionEntregaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionEntregaFinal.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    
}
