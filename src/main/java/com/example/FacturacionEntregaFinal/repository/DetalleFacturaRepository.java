package com.example.FacturacionEntregaFinal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionEntregaFinal.model.DetalleFactura;


public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura,Integer> {
    
}
