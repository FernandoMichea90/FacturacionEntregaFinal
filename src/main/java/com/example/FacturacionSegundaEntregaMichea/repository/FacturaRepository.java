package com.example.FacturacionSegundaEntregaMichea.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionSegundaEntregaMichea.model.Factura;
public interface FacturaRepository extends JpaRepository <Factura,Integer> {
    
}
