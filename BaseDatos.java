/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.sistemagestionventas;
/**
 *
 * @author SEBAMARTINES
public class BaseDatos {   
}*/

package com.sistemagestionventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDatos {

    private static final String URL = "jdbc:mysql://localhost:3306/SistemaVentas"; // es donde tengo guardado mi proyecto
    private static final String USER = "root"; //use el mismo nombre que vino al inicio
    private static final String PASSWORD = "Martinez44+"; // Esta es mi contraseña actual de host 3306 de MyQSL

    public Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public void agregarCliente(String apellido, String nombre, String direccion, String gmail) {
        String sql = "INSERT INTO Cliente (Apellido, Nombre, Direccion, Gmail) VALUES (?, ?, ?, ?)";
        try (Connection conn = conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, apellido);
            pstmt.setString(2, nombre);
            pstmt.setString(3, direccion);
            pstmt.setString(4, gmail);
            pstmt.executeUpdate();
            System.out.println("Cliente agregado con éxito");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarUsuario(String username, String password, boolean isAdmin) {
        String sql = "INSERT INTO Usuario (Username, Password, IsAdmin) VALUES (?, ?, ?)";
        try (Connection conn = conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setBoolean(3, isAdmin);
            pstmt.executeUpdate();
            System.out.println("Usuario agregado con éxito");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean autenticarUsuario(String username, String password, boolean isAdmin) {
        String sql = "SELECT * FROM Usuario WHERE Username = ? AND Password = ? AND IsAdmin = ?";
        try (Connection conn = conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setBoolean(3, isAdmin);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Aquí puedes agregar más métodos para manejar otras tablas y operaciones
}
