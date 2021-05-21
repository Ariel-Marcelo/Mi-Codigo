/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class ComparaNombres implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Empleado empleado1,empleado2;
        empleado1 = (Empleado)o1;
        empleado2 = (Empleado)o2;
        return empleado1.getNombre().compareToIgnoreCase(empleado2.getNombre());
    }

    
    
}
