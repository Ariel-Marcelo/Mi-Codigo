/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class ComparadorNombres implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Libro libro1,libro2;
        libro1 = (Libro)o1;
        libro2 = (Libro)o2;
        return libro1.getAutor().nombreAutor().compareTo(libro2.getAutor().nombreAutor());
    }

    
}
