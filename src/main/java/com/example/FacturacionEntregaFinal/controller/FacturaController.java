package com.example.FacturacionEntregaFinal.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FacturacionEntregaFinal.model.Factura;
import com.example.FacturacionEntregaFinal.service.FacturaService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequestMapping("/factura")
public class FacturaController {


     @Autowired
     private FacturaService facturaService;

     public ResponseEntity <List<Factura>> obtenerTodasLasFacturas(){
        List<Factura> detalles= facturaService.obtenerTodasLasFacturas();
        return ResponseEntity.ok(detalles);
    }

    public ResponseEntity <Factura> obtenerFacturaPorId(@PathVariable Integer id){
        Factura detalle = facturaService.obtenerFacturaPorId(id);
        return ResponseEntity.ok(detalle);
    }

    public ResponseEntity <Factura> guardarFactura(@RequestBody Factura factura){
        Factura detalle= facturaService.guardarFactura(factura);
        return ResponseEntity.ok(detalle); 

    }
   
}
