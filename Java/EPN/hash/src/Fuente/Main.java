/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuente;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumnos person1 = new Alumnos("Juan",18);
        Alumnos person2 = new Alumnos("Miguel",25);
        Alumnos person3 = new Alumnos("Luis",18);
        Alumnos person4 = new Alumnos("Luis",18);
        
        HashSet personas = new HashSet();
            personas.add(person1);
            personas.add(person2);
            personas.add(person3);
            personas.add(person4);
            
        System.out.println(personas.size());
        System.out.println(personas.toString());
        Map m = new HashMap();
   
        m.put(person1, "valor1");
        m.put(person2, "valor2");
        m.put(person3, "valor1");
        m.put(person4, "mi valor");
        
        System.out.println(m.keySet());
        System.out.println(m.size());
        
       System.out.println(m.keySet());
       System.out.println(m.size());
    }
    
}
