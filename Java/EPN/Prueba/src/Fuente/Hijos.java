/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuente;


public class Hijos {
    String nombre;
    String apellido;
    public  Hijos(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Hijos{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
