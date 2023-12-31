package com.example.FacturacionEntregaFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FacturacionEntregaFinal.model.DetalleFactura;
import com.example.FacturacionEntregaFinal.service.DetalleFacturaService;

@RestController
@RequestMapping("/detallesfactura")
public class DetalleFacturaController {

    @Autowired
    private DetalleFacturaService detalleFacturaService;

    @GetMapping
    public ResponseEntity<List<DetalleFactura>> obtenerTodosLosDetalles() {
        List<DetalleFactura> detalles = detalleFacturaService.obtenerTodoDetallesFacturar();
        return ResponseEntity.ok(detalles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleFactura> obtenerDetallePorId(@PathVariable Integer id) {
        DetalleFactura detalle = detalleFacturaService.obtenerDetalleFacturaPorId(id);
        return ResponseEntity.ok(detalle);
    }

    @PostMapping
    public ResponseEntity<DetalleFactura> guardarDetalle(@RequestBody DetalleFactura detalleFactura) {
        DetalleFactura detalle = detalleFacturaService.guardarDetalleFactura(detalleFactura);
        return ResponseEntity.ok(detalle);
    }
}
