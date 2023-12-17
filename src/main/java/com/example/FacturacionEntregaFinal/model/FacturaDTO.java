package com.example.FacturacionEntregaFinal.model;

import java.util.ArrayList;


public class FacturaDTO {

    private Integer idCliente;

    private ArrayList<ProductoDTO> ListaProductos;

    // Constructor.
    public FacturaDTO() {
        this.ListaProductos = new ArrayList<>();
    }

    // Getter para idCliente
    public Integer getIdCliente() {
        return idCliente;
    }

    // Setter para idCliente
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    // Getter para ListaProductos
    public ArrayList<ProductoDTO> getListaProductos() {
        return ListaProductos;
    }

    // Setter para ListaProductos
    public void setListaProductos(ArrayList<ProductoDTO> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }
    
    // Método para añadir un producto a la lista
    public void addProducto(ProductoDTO producto) {
        this.ListaProductos.add(producto);
    }

    // Método para eliminar un producto de la lista
    public void removeProducto(ProductoDTO producto) {
        this.ListaProductos.remove(producto);
    }
    
}
