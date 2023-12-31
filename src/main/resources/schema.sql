-- Borrar la base de datos ventas 
DROP DATABASE IF EXISTS ventas; 
-- crear la base de datos de ventas
CREATE DATABASE ventas;


-- Creación de la tabla cliente
CREATE TABLE cliente (
  id INT AUTO_INCREMENT PRIMARY KEY,
  apellido VARCHAR(255),
  fecha_nacimiento DATE,
  nombre VARCHAR(255),
  doc_number VARCHAR(255)
);

-- Creación de la tabla factura
CREATE TABLE factura (
  id INT AUTO_INCREMENT PRIMARY KEY,
  creando_en DATETIME,
  total DOUBLE,
  cliente_id INT,
  FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

-- Creación de la tabla producto
CREATE TABLE producto (
  id INT AUTO_INCREMENT PRIMARY KEY,
  codigo VARCHAR(255),
  descripcion TEXT,
  precio DOUBLE
);

-- Creación de la tabla detalle_factura
CREATE TABLE detalle_factura (
  id INT AUTO_INCREMENT PRIMARY KEY,
  cantidad INT,
  precio DOUBLE,
  factura_id INT,
  producto_id INT,
  FOREIGN KEY (factura_id) REFERENCES factura(id),
  FOREIGN KEY (producto_id) REFERENCES producto(id)
);

--borrar lo columna stock de producto.
-- ALTER TABLE producto DROP COLUMN stock;