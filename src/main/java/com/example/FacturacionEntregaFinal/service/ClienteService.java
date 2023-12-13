package com.example.FacturacionEntregaFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacturacionEntregaFinal.model.Cliente;
import com.example.FacturacionEntregaFinal.repository.ClienteRepository;

import java.util.List;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }
    public Cliente obtenerClientePorId(Integer id){
        return clienteRepository.findById(id)
        .orElseThrow(()-> new EntityNotFoundException());
    }
    
    public Cliente guardarCliente (Cliente cliente){

        return clienteRepository.save(cliente);

    }

}
