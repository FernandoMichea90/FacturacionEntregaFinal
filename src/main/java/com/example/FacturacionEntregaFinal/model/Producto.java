package com.example.FacturacionEntregaFinal.model;

import jakarta.persistence.*;
import lombok.ToString;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@ToString
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull private String descripcion;
    @NonNull private String codigo;
    @NonNull private Integer precio;




}
