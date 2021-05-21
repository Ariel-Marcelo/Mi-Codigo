
package Corrección;

public class Persona {
    String nombre;
    
    
    public Persona(String nombre)
    {
        setPersona(nombre);
       
    }
    
    public void setPersona(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
}
