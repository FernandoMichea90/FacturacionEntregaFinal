package com.example.FacturacionSegundaEntregaMichea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.FacturacionSegundaEntregaMichea.model.Cliente;
import com.example.FacturacionSegundaEntregaMichea.repository.ClienteRepository;

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
