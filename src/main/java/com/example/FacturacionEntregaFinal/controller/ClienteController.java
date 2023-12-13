package com.example.FacturacionEntregaFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacturacionEntregaFinal.model.Cliente;
import com.example.FacturacionEntregaFinal.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    

    @GetMapping
    public ResponseEntity<List<Cliente>> obtenerTodosLosClientes() {
        List<Cliente> detalles = clienteService.obtenerTodosLosClientes();
        return ResponseEntity.ok(detalles);
    }

    @GetMapping("{id}")
    public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Integer id) {
        try {
            Cliente detalle = clienteService.obtenerClientePorId(id);
            if (detalle == null) {
                return ResponseEntity.notFound().build();
            }

            return ResponseEntity.ok(detalle);


        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity <Cliente> guardarCliente(@RequestBody Cliente cliente){
        try {
            Cliente detalle= clienteService.guardarCliente(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body(detalle);
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }

        
    }

}
