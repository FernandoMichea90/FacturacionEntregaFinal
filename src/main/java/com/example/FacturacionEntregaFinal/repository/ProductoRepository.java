package com.example.FacturacionEntregaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FacturacionEntregaFinal.model.Producto;


public interface ProductoRepository extends JpaRepository<Producto,Integer> {    

}
