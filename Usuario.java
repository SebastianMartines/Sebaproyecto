/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.sistemagestionventas;

/**
 *
 * @author SEBA
 
public class Usuario {
    
}*/


package com.sistemagestionventas;
//ESTA CLASE ES USADA SOLO PARA EL USUARIO EN LA CUAL SE PUEDE REGISTRAR COMO TAMBIEN INICIAR SESION
public class Usuario {
    private int idUsuario;
    private String apellido;
    private String nombre;
    private String contrasena;

    public Usuario(int idUsuario, String apellido, String nombre, String contrasena) { //SON LOS DATOS QUE SE HA PEDIDO AL USUARIO
        this.idUsuario = idUsuario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

