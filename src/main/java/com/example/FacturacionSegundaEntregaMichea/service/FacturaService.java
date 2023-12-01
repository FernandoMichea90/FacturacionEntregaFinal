package com.example.FacturacionSegundaEntregaMichea.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.FacturacionSegundaEntregaMichea.repository.FacturaRepository;

import jakarta.persistence.EntityNotFoundException;

import com.example.FacturacionSegundaEntregaMichea.model.Factura;


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
