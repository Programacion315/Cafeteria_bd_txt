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
public class Cliente {
    
    private String nombre;
    private double celular;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, double precio) {
        this.nombre = nombre;
        this.celular = precio;
       
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCelular() {
        return celular;
    }

    public void setCelular(double precio) {
        this.celular = precio;
    }
    
    public void guardar(PrintWriter Escribe) {
        Escribe.println(nombre);
        Escribe.println(celular);
        
    }
    
    public Cliente cargar(BufferedReader Almacen) {
        String nom;
        double ced;
        
        try {
            nom = Almacen.readLine();
            ced = Double.parseDouble(Almacen.readLine());
           
            return new Cliente(nom,ced);
        } catch (Exception e) {
        }
        return null;
    }
}
