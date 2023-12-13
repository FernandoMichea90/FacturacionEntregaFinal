package com.example.FacturacionEntregaFinal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionEntregaFinal.model.Factura;
public interface FacturaRepository extends JpaRepository <Factura,Integer> {
    
}
