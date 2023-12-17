package com.example.FacturacionEntregaFinal.model;

import jakarta.persistence.*;
import lombok.ToString;
import lombok.Data;

@ToString
@Data
@Entity
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Factura factura;

    private Integer cantidad;
    private Integer precio;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    // Constructor.
    public DetalleFactura() {
    }

    // Constructor con parametros.
    public DetalleFactura(Factura factura , Integer cantidad, Integer precio,Producto producto) {
        this.factura = factura;
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

}
