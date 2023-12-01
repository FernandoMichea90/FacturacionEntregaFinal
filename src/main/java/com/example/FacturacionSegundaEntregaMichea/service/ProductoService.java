package com.example.FacturacionSegundaEntregaMichea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FacturacionSegundaEntregaMichea.model.Producto;
import com.example.FacturacionSegundaEntregaMichea.repository.ProductoRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos(){
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Integer id){
        return productoRepository.findById(id).
            orElseThrow(()->new EntityNotFoundException());
    }

    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    
}
