/* sebastian_Martines */

-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS SistemaVentas;
USE SistemaVentas;

-- Crear la tabla Clientes
CREATE TABLE IF NOT EXISTS Clientes (
    IdCliente INT AUTO_INCREMENT PRIMARY KEY,
    Apellido VARCHAR(50),
    Nombre VARCHAR(50),
    Direccion VARCHAR(100),
    Gmail VARCHAR(100)
);

-- Crear la tabla Usuario
CREATE TABLE IF NOT EXISTS Usuario (
    IdUsuario INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(50) NOT NULL,
    Password VARCHAR(50) NOT NULL,
    IsAdmin BOOLEAN NOT NULL
);

-- Crear la tabla VentaPedido
CREATE TABLE IF NOT EXISTS VentaPedido (
    NroPedido INT AUTO_INCREMENT PRIMARY KEY,
    IdCliente INT,
    Fecha DATE,
    Estado VARCHAR(50),
    FOREIGN KEY (IdCliente) REFERENCES Clientes(IdCliente)
);

-- Crear la tabla Producto
CREATE TABLE IF NOT EXISTS Producto (
    IdProducto INT AUTO_INCREMENT PRIMARY KEY,
    Descripcion VARCHAR(254),
    Precio DECIMAL(10, 2),
    Stock INT
);

-- Crear la tabla DetallesVentasPedidos
CREATE TABLE IF NOT EXISTS DetallesVentasPedidos (
    NroPedido INT,
    IdProducto INT,
    Cantidad INT,
    Detalles VARCHAR(254),
    Total DECIMAL(20, 2),
    PRIMARY KEY (NroPedido, IdProducto),
    FOREIGN KEY (NroPedido) REFERENCES VentaPedido(NroPedido),
    FOREIGN KEY (IdProducto) REFERENCES Producto(IdProducto)
);

-- Crear la tabla Stock
CREATE TABLE IF NOT EXISTS Stock (
    IdProducto INT PRIMARY KEY,
    CantidadProd INT,
    FOREIGN KEY (IdProducto) REFERENCES Producto(IdProducto)
);

-- Crear la tabla Deposito
CREATE TABLE IF NOT EXISTS Deposito (
    IdProducto INT PRIMARY KEY,
    CantidProd INT,
    ListadoProd VARCHAR(254),
    Totales DECIMAL(20, 2),
    FOREIGN KEY (IdProducto) REFERENCES Producto(IdProducto)
);

-- Insertar datos de prueba en la tabla Clientes
INSERT INTO Clientes (Apellido, Nombre, Direccion, Gmail) VALUES 
('Perez', 'Juan', 'Calle Falsa 123', 'juan.perez@gmail.com'),
('Gomez', 'Maria', 'Avenida Siempreviva 742', 'maria.gomez@gmail.com');

-- Insertar datos de prueba en la tabla Usuario
INSERT INTO Usuario (Username, Password, IsAdmin) VALUES 
('admin', 'admin123', true),
('user', 'user123', false);

-- Insertar datos de prueba en la tabla VentaPedido
INSERT INTO VentaPedido (IdCliente, Fecha, Estado) VALUES 
(1, '2024-01-01', 'Pendiente'),
(2, '2024-01-02', 'Completado');

-- Insertar datos de prueba en la tabla Producto
INSERT INTO Producto (Descripcion, Precio, Stock) VALUES 
('Repuesto A', 100.00, 50),
('Repuesto B', 200.00, 30);

-- Insertar datos de prueba en la tabla DetallesVentasPedidos
INSERT INTO DetallesVentasPedidos (NroPedido, IdProducto, Cantidad, Detalles, Total) VALUES 
(1, 1, 2, 'Compra de 2 Repuestos A', 200.00),
(2, 2, 1, 'Compra de 1 Repuesto B', 200.00);

-- Insertar datos de prueba en la tabla Stock
INSERT INTO Stock (IdProducto, CantidadProd) VALUES 
(1, 50),
(2, 30);

-- Insertar datos de prueba en la tabla Deposito
INSERT INTO Deposito (IdProducto, CantidProd, ListadoProd, Totales) VALUES 
(1, 50, 'Repuesto A', 5000.00),
(2, 30, 'Repuesto B', 6000.00);




