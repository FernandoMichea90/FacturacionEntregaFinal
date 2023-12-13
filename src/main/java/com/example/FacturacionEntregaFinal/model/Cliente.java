package com.example.FacturacionEntregaFinal.model;
import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.ToString;
import lombok.Data;
@ToString
@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
   @Column(name = "doc_number")
    private String numeroDocumento;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    // Constructor, getters, setters, etc.
}