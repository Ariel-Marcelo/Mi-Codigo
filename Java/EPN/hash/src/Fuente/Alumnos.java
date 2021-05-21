/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuente;

/**
 *
 * @author user
 */
public class Alumnos {
    private int age;
    private String name;

    Alumnos(String name, int age){
    	this.name = name;
    	this.age = age;   
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Alumnos) {
            Alumnos p = (Alumnos)o;
            return this.name.equals(p.name);
        } else {
            return false;
        } 
    }
    
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "age=" + age + ", name=" + name + '}';
    }
    
    

}
