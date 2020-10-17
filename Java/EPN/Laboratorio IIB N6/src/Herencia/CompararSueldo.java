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
public class CompararSueldo implements Comparator{

    

    @Override
    public int compare(Object o1, Object o2) {
        Empleado empleado1, empleado2;
        empleado1 = (Empleado)o1;
        empleado2 = (Empleado)o2;
        
        if(empleado1.getSalario()> empleado2.getSalario() )
        {
            return 1;
        }else
        {
            if(empleado1.getSalario() == empleado2.getSalario())
            {
                return 0;
            }else{
                return -1;
            }
        }
    }
    
}
