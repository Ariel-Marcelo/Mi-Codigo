
package Corrección;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Familia {
    Persona padre;
    Persona madre;
    Persona hijo;
    ArrayList <Persona> listaHijos;
    
    public Familia(String nombrePadre, String nombreMadre, String nombreHijo )
    {
        listaHijos = new ArrayList();
        this.padre = new Persona(nombrePadre);
        this.madre = new Persona(nombreMadre);
        StringTokenizer masHijos = new StringTokenizer(nombreHijo,","); 
        for(int i = 0; masHijos.hasMoreTokens(); i++)
        {
            this.hijo = new Persona(masHijos.nextToken());
            listaHijos.add(this.hijo);
        }
    }

    @Override
    public String toString() {
        
        
       String salida =  "Familia:\n" + 
                "Padre: " + padre + "\n"
               +"Madre: " + madre + "\n";
        int i = 0;  
       for(Persona hijo: listaHijos)
       {
           i++;
           salida += "Hijo " + i +": " + hijo + "\n";
       }
       
       return salida;
    }
    
    
}
