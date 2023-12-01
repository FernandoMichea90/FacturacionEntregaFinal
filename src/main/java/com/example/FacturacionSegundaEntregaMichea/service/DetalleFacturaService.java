package com.example.FacturacionSegundaEntregaMichea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.FacturacionSegundaEntregaMichea.model.DetalleFactura;
import com.example.FacturacionSegundaEntregaMichea.repository.DetalleFacturaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DetalleFacturaService {
    @Autowired
    DetalleFacturaRepository detalleFacturaRepository;

    public List<DetalleFactura> obtenerTodoDetallesFacturar(){
        return detalleFacturaRepository.findAll();
    }
    
    public DetalleFactura obtenerDetalleFacturaPorId(Integer id){
        return detalleFacturaRepository.findById(id).
                    orElseThrow(()->new EntityNotFoundException());

    }

    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura){
        return detalleFacturaRepository.save(detalleFactura);
    }

}
