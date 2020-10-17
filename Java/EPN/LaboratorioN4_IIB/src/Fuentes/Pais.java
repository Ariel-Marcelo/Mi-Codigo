
package Fuentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Pais {
    ArrayList <Provincia> listaprovincias;
    
    
    public Pais()
    {
        listaprovincias = new ArrayList();
    }
    
    public void addProvincia(Provincia provincia )
    {
        listaprovincias.add(provincia);
    }
    
    public Provincia getProvincia(int g)
    {
        return listaprovincias.get(g);
    }
    public void ordenarProvincias()
    {
        Collections.sort( listaprovincias, new ComparadorProvincia() );
    }
    public void ordenarPorNumHabitantes()
    {
        Collections.sort(listaprovincias, new ComparadorProvincaHabitantes());
    }
    public Object ordenarMaxNumHabitantes()
    {
        return Collections.max(listaprovincias, new ComparadorProvincaHabitantes());
    }
    public Object ordenarMinHabitantes()
    {
        return Collections.min(listaprovincias, new ComparadorProvincaHabitantes());
    }
    public int busquedaBinariaPorProvincia(Provincia provinciaBuscada)
    {
        ordenarProvincias();
        return Collections.binarySearch(listaprovincias, provinciaBuscada, new ComparadorProvincia() );
    }
    public int busquedaBinariaNumHabitantes(Provincia provinciaBuscada)
    {
        ordenarPorNumHabitantes();
        return Collections.binarySearch(listaprovincias, provinciaBuscada, new ComparadorProvincaHabitantes());
    }
    
    public void BorrarElemento(String nomprovincia)
    {
        Iterator<Provincia> it = listaprovincias.iterator();
        while(it.hasNext())
        {
            Provincia provincia = it.next();
            if(provincia.getNombreProvincia().equalsIgnoreCase(nomprovincia))
            {
                it.remove();
            }
        }
    }
    @Override
    public String toString()
    {
        String salida = "";
        for(Provincia imprime: listaprovincias)
        {
            salida += imprime + "\n\n";
        }
        return salida;
        
    }
    
}
