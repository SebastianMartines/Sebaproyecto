/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package com.sistemagestionventas;

/**
 *
 * @author SEBA
 
public class VentaPedido {
    
}*/


package com.sistemagestionventas;
//AQUI SE VAN A IR DETALLANDO EL PEDIDO DE LAS VENTAS
import java.sql.Date;

public class VentaPedido {
    private int nroPedido;
    private int idCliente;
    private Date fecha;
    private String estado;

    public VentaPedido(int nroPedido, int idCliente, Date fecha, String estado) {
        this.nroPedido = nroPedido;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

