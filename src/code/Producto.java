/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author jorge
 */
public class Producto {
    
    private String nombre;
    private double precio;
    
    public Producto(){
        
    }
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void guardar(PrintWriter Escribe) {
        Escribe.println(nombre);
        Escribe.println(precio);
        
    }
    
    public Producto cargar(BufferedReader Almacen) {
        String nom;
        double ced;
        
        try {
            nom = Almacen.readLine();
            ced = Double.parseDouble(Almacen.readLine());
            
            return new Producto(nom, ced);
        } catch (Exception e) {
        }
        return null;
    }
}
