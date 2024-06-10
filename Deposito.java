/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.sistemagestionventas;

/**
 *
 * @author SEBA
 
public class Deposito {
    
}*/


package com.sistemagestionventas;
//DEPOSITO. SE TENDRA EN CUENTA LA CANTIDAD Y ID DEL PRODUCTO, COMO ASI TAMBIEN EL LISTADO DE LOS PROD
public class Deposito {
    private int idProducto;
    private int cantidadProd;
    private String listadoProd;
    private double totales;

    public Deposito(int idProducto, int cantidadProd, String listadoProd, double totales) {
        this.idProducto = idProducto;
        this.cantidadProd = cantidadProd;
        this.listadoProd = listadoProd;
        this.totales = totales;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public String getListadoProd() {
        return listadoProd;
    }

    public void setListadoProd(String listadoProd) {
        this.listadoProd = listadoProd;
    }

    public double getTotales() {
        return totales;
    }

    public void setTotales(double totales) {
        this.totales = totales;
    }
}

