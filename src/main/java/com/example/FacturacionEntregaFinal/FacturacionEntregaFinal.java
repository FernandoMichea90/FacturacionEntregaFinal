package com.example.FacturacionEntregaFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.FacturacionEntregaFinal.model.Cliente;
import com.example.FacturacionEntregaFinal.model.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.text.SimpleDateFormat;
import com.example.FacturacionEntregaFinal.repository.ClienteRepository;
import com.example.FacturacionEntregaFinal.repository.ProductoRepository;


@SpringBootApplication
public class FacturacionEntregaFinal implements CommandLineRunner {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ProductoRepository productoRepository;


	public static void main(String[] args) {
		SpringApplication.run(FacturacionEntregaFinal.class, args);
	}


	public void run(String... args) throws Exception {
		System.out.println("La aplicacion se ha iniciado correctamente");
		// Crear un clientes
		Cliente cliente1 = new  Cliente("Juan", "Perez", "12345678",new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1990"));
		Cliente cliente2 = new  Cliente("Maria", "Gomez", "87654321",new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1990"));
		//guardar el cliente en la base de datos
		clienteRepository.save(cliente1);
		clienteRepository.save(cliente2);

		System.out.println("Se han creado los clientes");
		// Crear productos 
		Producto producto1 = new Producto("Coca Cola", "12345", 2000);
		Producto producto2 = new Producto( "Pepsi", "54321", 1500);
		//Guardar los productos en la base de datos
		productoRepository.save(producto1);
		productoRepository.save(producto2);
		System.out.println("Se han creado los productos");
		
		}


}


  