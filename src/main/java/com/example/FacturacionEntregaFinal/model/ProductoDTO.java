package com.example.FacturacionEntregaFinal.model;

public class ProductoDTO {

    Integer id_producto;
    Integer stock;

    // Constructor.
    public ProductoDTO(Integer id_producto, Integer stock) {
        this.id_producto = id_producto;
        this.stock = stock;
    }

    // Getter para id_producto
    public Integer getIdProducto() {
        return id_producto;
    }

    // Setter para id_producto
    public void setIdProducto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    // Getter para stock
    public Integer getStock() {
        return stock;
    }

    // Setter para stock
    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
