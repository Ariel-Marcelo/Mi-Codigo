
package Fuentes;

import java.util.ArrayList;


public class ListaHumanos {
    
    ArrayList <Humano> listaHumanos;
    
    public ListaHumanos()
    {
        listaHumanos = new ArrayList();
    }
    
    public void addHumano(Humano humano)
    {
        listaHumanos.add(humano);
    }

    @Override
    public String toString() {
        String salida = "";
        int contador = 1;
        for( Humano aux: listaHumanos)
        {
            salida += "" + contador + aux + "\n";
        }
       return salida;
    }
    
}
