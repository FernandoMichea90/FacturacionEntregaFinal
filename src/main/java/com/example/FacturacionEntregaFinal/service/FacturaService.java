package com.example.FacturacionEntregaFinal.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacturacionEntregaFinal.model.Factura;
import com.example.FacturacionEntregaFinal.model.Cliente;
import com.example.FacturacionEntregaFinal.model.Producto;
import com.example.FacturacionEntregaFinal.model.ProductoDTO;
import com.example.FacturacionEntregaFinal.model.DetalleFactura;
import com.example.FacturacionEntregaFinal.model.FacturaDTO;
import com.example.FacturacionEntregaFinal.model.FacturaProductoDTO;
import com.example.FacturacionEntregaFinal.repository.FacturaRepository;
import com.example.FacturacionEntregaFinal.repository.ClienteRepository;
import com.example.FacturacionEntregaFinal.repository.ProductoRepository;
import com.example.FacturacionEntregaFinal.repository.DetalleFacturaRepository;


import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import jakarta.persistence.EntityNotFoundException;


@Service
public class FacturaService {
    
    @Autowired
    FacturaRepository facturaRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    DetalleFacturaRepository detalleFacturaRepository;

    public List <Factura> obtenerTodasLasFacturas(){
        return facturaRepository.findAll();
    }

    public FacturaProductoDTO obtenerFacturaPorId(Integer id){
        // obetener la factura por id
        Factura factura= facturaRepository.findById(id).
            orElseThrow(()->new EntityNotFoundException());
        // obtener los detalles de la factura   
        List<DetalleFactura> detalles=detalleFacturaRepository.findByFactura(factura); 
        // crear la lista de productos
        ArrayList<Producto> productos= new ArrayList<Producto>();
        // recorrer los detalles de la factura
        for (DetalleFactura detalle:detalles)
        {
            // agregar el producto a la lista
            productos.add(detalle.getProducto());
        }
        // crear la FacturaProductoDTO
        FacturaProductoDTO facturaProductoDTO= new FacturaProductoDTO(factura,productos);
        return  facturaProductoDTO;
    }

    public Factura guardarFactura(FacturaDTO factura){

        Optional<Cliente> cliente= clienteRepository.findById(factura.getIdCliente());
        // Se crea la nueva factura en la base de datos
         Factura nuevaFactura=facturaRepository.save(new Factura(cliente.get(),new Date(),0.0));
        
         // Variable para almacenar el total de la factura
        Double totalFactura=0.0;
         // recorrer los productos 
        for (ProductoDTO producto:factura.getListaProductos())
        {
             // buscar el producto en la base de datos
            Producto productoBD=productoRepository.findById(producto.getIdProducto()).orElseThrow(()->new EntityNotFoundException());
            // Crear el detalle de la factura
            DetalleFactura detalleFactura= new DetalleFactura(nuevaFactura,producto.getStock(),productoBD.getPrecio(),productoBD);            
            // Se guarda el detalle de la factura en la base de datos
            detalleFacturaRepository.save(detalleFactura);
            // se calcula el subtotal del producto,convertir el int a double
            Double subtotal = producto.getStock().doubleValue()*productoBD.getPrecio().doubleValue();
            // se suma el subtotal al total de la factura
            totalFactura+=subtotal;

        };

        // Se actualiza el total de la factura
        nuevaFactura.setTotal(totalFactura);
        // Se actualiza la factura en la base de datos
        nuevaFactura= facturaRepository.save(nuevaFactura);

                      
        return nuevaFactura;
    }

}
