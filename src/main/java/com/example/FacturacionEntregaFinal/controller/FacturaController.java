package com.example.FacturacionEntregaFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacturacionEntregaFinal.model.Factura;
import com.example.FacturacionEntregaFinal.model.FacturaDTO;
import com.example.FacturacionEntregaFinal.model.FacturaProductoDTO;
import com.example.FacturacionEntregaFinal.service.FacturaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public ResponseEntity<List<Factura>> obtenerTodasLasFacturas() {
        List<Factura> detalles = facturaService.obtenerTodasLasFacturas();
        return ResponseEntity.ok(detalles);
    }

  
    // Guardar factura.
    @PostMapping
    public ResponseEntity<?> guardarFactura(@RequestBody FacturaDTO facturaDTO) {
        try {
            // validar si existe una lista de productos 
            if (facturaDTO.getListaProductos() == null || facturaDTO.getListaProductos().isEmpty()) {
                return ResponseEntity.badRequest().body("La lista de productos no puede ser nula o vacia");

            }
            Factura detalle = facturaService.guardarFactura(facturaDTO);
            return ResponseEntity.ok(detalle);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar la factura: " + e.getMessage());
        }

    }

    // Obtener factura por id.
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerFacturaPorId(@PathVariable Integer id) {
        try {
            FacturaProductoDTO factura = facturaService.obtenerFacturaPorId(id);
            return ResponseEntity.ok(factura);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al obtener la factura: " + e.getMessage());
        }
    }

}
