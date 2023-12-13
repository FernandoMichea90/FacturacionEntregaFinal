package com.example.FacturacionEntregaFinal.model;

import jakarta.persistence.*;
import java.util.Date;
import lombok.ToString;
import lombok.Data;

@ToString
@Data
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @Column(name="creando_en")
    private Date creadoEn;

    private Double total;

}
