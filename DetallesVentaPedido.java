/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

package com.sistemagestionventas;

/**
 *
 * @author SEBA

public class DetallesVentaPedido {
    
} */


package com.sistemagestionventas;
//DETALLAMOS LO DE VENTA DE PEDIDOS
public class DetallesVentaPedido {
    private int nroPedido;
    private int idProducto;
    private int cantidad;
    private String detalles;
    private double total;

    public DetallesVentaPedido(int nroPedido, int idProducto, int cantidad, String detalles, double total) {
        this.nroPedido = nroPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.detalles = detalles;
        this.total = total;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

