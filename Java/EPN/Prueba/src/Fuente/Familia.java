
package Fuente;

import java.util.ArrayList;
import java.util.StringTokenizer;
public class Familia {
    
    String apellidoFamilia;
    Padre padre;
    Madre madre;
    Hijos hijos;
    ArrayList<Hijos> hijo;
    
    public  Familia(String nomPadre, String apellidoPadre, String nomMadre, String apellidoMadre, String nomHijos)
    {
       this.apellidoFamilia = apellidoPadre;
       padre = new Padre(nomPadre,apellidoPadre);
       madre = new Madre(nomMadre,apellidoMadre);
       hijos = new Hijos(nomHijos,apellidoPadre);
       hijo.add(hijos);
       
    }

    @Override
    public String toString() {
        return "Familia{" + "apellidoFamilia=" + apellidoFamilia + ", padre=" + padre + ", madre=" + madre + ", hijos=" + hijos + ", hijo=" + hijo + '}';
    }
    
}
