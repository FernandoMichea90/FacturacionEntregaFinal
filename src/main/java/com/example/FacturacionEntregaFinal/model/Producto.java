package com.example.FacturacionEntregaFinal.model;

import jakarta.persistence.*;
import lombok.ToString;
import lombok.Data;

@ToString
@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private String codigo;
    private Integer precio;

}
