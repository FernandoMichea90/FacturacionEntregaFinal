package com.example.FacturacionSegundaEntregaMichea.model;

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
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

}
