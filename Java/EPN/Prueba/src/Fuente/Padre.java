
package Fuente;

public class Padre {
    String nombre; 
    String apellido;
    
    public  Padre(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        
    }
    
    public void setPadre(String nombre)
    {
        this.nombre = nombre;
         
    }
}
