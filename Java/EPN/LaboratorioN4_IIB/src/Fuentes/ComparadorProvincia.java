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
import java.util.Comparator;
public class ComparadorProvincia implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Provincia provincia1,provincia2;
        provincia1 = (Provincia)o1;// tenemos 2 objetos y o1 los cambiamos a tipo
        provincia2 = (Provincia)o2;// provincia
        return (provincia1.getNombreProvincia().compareTo(provincia2.getNombreProvincia()));
    }   // devolvemos un entero ya sea mayor o menor o igual a 0

    
    
}
