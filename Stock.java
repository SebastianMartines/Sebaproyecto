/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.sistemagestionventas;

/**
 *
 * @author SEBA
 
public class Stock {
    
}*/


package com.sistemagestionventas;
//EN PRINCIPIO NO SE IVA A USAR STOCK, PERO VIENDO LAS CIRCUNSTANCIAS E IMPLEMENTADO ESTA
//CLASE YA QUE NECESITO SABER QUE PRODUCTO QUEDA EN STOCK A LA HORA DE VENDER ALGUN REPUESTO
public class Stock {
    private int idProducto;
    private int cantidadProd;

    public Stock(int idProducto, int cantidadProd) {
        this.idProducto = idProducto;
        this.cantidadProd = cantidadProd;
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
}
