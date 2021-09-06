/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author jorge
 */
public class Pedido {
     
    private String factura;
    private double celular;
    private String producto;
    private int cantidad;
    //private double valorUnidad;
    private double valorTotal;
    private String fechaRegistro;

    
    public Pedido(){
        
    }
    
    
    
    public Pedido(String factura, double celular, String producto, int cantidad, double valorTotal, String fechaRegistro) {
        this.factura = factura;
        this.celular = celular;
        this.producto = producto;
        this.cantidad = cantidad;
        //this.valorUnidad = valorUnidad;
        this.valorTotal = valorTotal;
        this.fechaRegistro = fechaRegistro;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public double getCelular() {
        return celular;
    }

    public void setIdCliente(double idCliente) {
        this.celular = idCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public void guardar(PrintWriter Escribe) {
        Escribe.println(factura);
        Escribe.println(celular);
        Escribe.println(producto);
        Escribe.println(cantidad);
        
        Escribe.println(valorTotal);
        Escribe.println(fechaRegistro);
        
    }
    
    public Pedido cargar(BufferedReader Almacen) {
        String nom;
        double celular;
        String ter;
        int cantidad;
        
        double valorTotal;
        String fechaRegistro;
        
        try {
            nom = Almacen.readLine();
            celular = Double.parseDouble(Almacen.readLine());
            ter = Almacen.readLine();
            cantidad = Integer.parseInt(Almacen.readLine());
            
            valorTotal = Double.parseDouble(Almacen.readLine());
            fechaRegistro = Almacen.readLine();
            
            return new Pedido(nom, celular,ter,cantidad,valorTotal,fechaRegistro);
            
        } catch (Exception e) {
            
        }
        
        return null;
    }
    
    
    
}
