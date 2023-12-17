package com.example.FacturacionEntregaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionEntregaFinal.model.DetalleFactura;
import com.example.FacturacionEntregaFinal.model.Factura;
import java.util.List;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura,Integer> {

    // obtener todos los productos de una factura;
      List<DetalleFactura> findByFactura(Factura factura);

}
