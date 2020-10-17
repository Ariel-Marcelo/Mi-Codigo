package Fuentes;

import java.util.ArrayList;


public class ListaAnimales {
    ArrayList <Animal> listaAnimales;
    
    public ListaAnimales()
    {
        listaAnimales = new ArrayList();
    }
    public void addAnimal(Animal animal)
    {
        listaAnimales.add(animal);
    }

    @Override
    public String toString() {
        String salida = "";
        int contador= 1;
        for(Animal aux: listaAnimales)
        {
            salida += " " + contador + aux + "\n";
            contador++;
        }
        return salida;
    }
    
    
}
