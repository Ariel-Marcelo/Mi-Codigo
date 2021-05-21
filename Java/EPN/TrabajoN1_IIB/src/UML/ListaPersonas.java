
package UML;

import java.util.ArrayList;

public class ListaPersonas {
    
    public ArrayList<Persona> listaPersonas;
    
    public ListaPersonas()
    {
       listaPersonas = new ArrayList(); 
    }
    
    public void addVehiculos(Persona persona)
    {
    
        listaPersonas.add(persona);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Persona persona: listaPersonas)
        {
            salida += persona;
        }
        return salida;
    }

    
    
}
