/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

/**
 *
 * @author user
 */
public class Canton {
    
    String nombre;
    int numHabitantes;
    public Canton(String nombre, int numPersonas)
    {
        this.nombre = nombre;
        this.numHabitantes = numPersonas;
    }
    
    public int getNumHabitantes()
    {
        return numHabitantes;
    }
    
    public String getNombreCan()
    {
        return nombre;
    }
}
