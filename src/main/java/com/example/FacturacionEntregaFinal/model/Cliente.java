package com.example.FacturacionEntregaFinal.model;
import java.util.Date;

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
    private Date fechaNacimiento;

    public Cliente() {
    }
    //Crear el contructor con todos los parametros. 
    public Cliente(String nombre, String apellido, String numeroDocumento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
    }
    // Constructor, getters, setters, etc.
}