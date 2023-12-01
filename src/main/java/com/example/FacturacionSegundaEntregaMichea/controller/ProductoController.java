package com.example.FacturacionSegundaEntregaMichea.controller;
import com.example.FacturacionSegundaEntregaMichea.service.ProductoService;
import com.example.FacturacionSegundaEntregaMichea.model.Producto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity <List<Producto>> obtenerProducto(){
        List<Producto> detalles= productoService.obtenerTodosLosProductos();
        return ResponseEntity.ok(detalles);
    }
    
    @GetMapping("{id}")
    public ResponseEntity <Producto> obtenerProductoPorId(@PathVariable Integer id)
    {
        Producto producto=productoService.obtenerProductoPorId(id);
        return ResponseEntity.ok(producto);
    }

   @PostMapping
   public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto){
        Producto detalle=productoService.guardarProducto(producto);
        return  ResponseEntity.ok(detalle);
   }
    
}

