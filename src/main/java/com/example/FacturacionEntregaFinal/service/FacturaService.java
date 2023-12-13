package com.example.FacturacionEntregaFinal.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacturacionEntregaFinal.model.Factura;
import com.example.FacturacionEntregaFinal.repository.FacturaRepository;

import java.util.List;

import jakarta.persistence.EntityNotFoundException;


@Service
public class FacturaService {
    
    @Autowired
    FacturaRepository facturaRepository;

    public List <Factura> obtenerTodasLasFacturas(){
        return facturaRepository.findAll();
    }

    public Factura obtenerFacturaPorId(Integer id){
        return  facturaRepository.findById(id).
            orElseThrow(()->new EntityNotFoundException());
    }

    public Factura guardarFactura(Factura factura){
        return facturaRepository.save(factura);
    }

}
