
package UML;

import java.util.ArrayList;


public class ListaVegetales {
    public ArrayList <Vegetal> listaVegetales;
    
    public ListaVegetales(Vegetal vegetal)
    {
        listaVegetales = new ArrayList();
        
    }
    
    public void addVegetales(Vegetal vegetal)
    {
        listaVegetales.add(vegetal);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Vegetal vegetal: listaVegetales)
        {
            salida += vegetal;
        }
        return salida;
    }
    
}
