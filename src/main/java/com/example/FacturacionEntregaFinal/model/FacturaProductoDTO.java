package com.example.FacturacionEntregaFinal.model;
import java.util.ArrayList;


public class FacturaProductoDTO {
    private Factura factura;
    private ArrayList<Producto> productos;

    // Constructor.
    public FacturaProductoDTO() {
        this.productos = new ArrayList<>();
    }
    // Contructor con parametros
    public FacturaProductoDTO(Factura factura, ArrayList<Producto> productos) {
        this.factura = factura;
        this.productos = productos;
    }
    // Getter para factura
    public Factura getFactura() {
        return factura;
    }
    // Setter para factura
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    // Getter para productos
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    // Setter para productos
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
}
