package com.example.FacturacionSegundaEntregaMichea.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionSegundaEntregaMichea.model.DetalleFactura;


public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura,Integer> {
    
}
