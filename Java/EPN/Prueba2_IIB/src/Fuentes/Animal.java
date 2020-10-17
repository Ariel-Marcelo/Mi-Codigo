
package Fuentes;


public abstract class Animal implements AccionesGeneral{

    
    private final String nombre;

    public Animal(String especie) {
        this.nombre = especie;
       
    }

    @Override
    public String toString() {
        return "\n"+ "Mi nombre es: "+ nombre + "\n Soy Animal: ";
    }
    
    

    
}
