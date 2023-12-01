package com.example.FacturacionSegundaEntregaMichea.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FacturacionSegundaEntregaMichea.model.Producto;


public interface ProductoRepository extends JpaRepository<Producto,Integer> {    

}
