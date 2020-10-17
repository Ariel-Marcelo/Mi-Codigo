package Fuentes;

import java.util.ArrayList;

public class ListaFiguras {
    ArrayList<Figura> listaFiguras;

    public ListaFiguras() {
        listaFiguras = new ArrayList();
    }
    public void addFigura(Figura figura)
    {
        listaFiguras.add(figura);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Figura figura: listaFiguras)
        {
            salida += figura.toString() + "\n\n";
        }
        return salida;
    }
    
}
