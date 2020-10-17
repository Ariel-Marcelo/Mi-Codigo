package Fuentes;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class ListaLibros  {
    private final Set <Libro> listadeLibros;
    
    public ListaLibros()
    {
       listadeLibros = new HashSet<>();
        
    }  
    public void agregarLibro(Libro libroNuevo)
    {   
        
        listadeLibros.add(libroNuevo);
    }
    public void ordenarPorAutor()
    {
        List<Libro> listaAux = new ArrayList(listadeLibros);
        Collections.sort(listaAux,new ComparadorNombres());
        listadeLibros.clear();
        listaAux.forEach((listaAux2) -> {
            listadeLibros.add((Libro) listaAux2);
        });
    }
    public void ordenarPorTitulo()
    {
        //int[] array = new int[4];
        //List<Libro> lista2 = new LinkedList(listadeLibros);
        List<Libro> listaAux = new ArrayList(listadeLibros);
        Collections.sort(listaAux,new ComparadorTitulos());
        listadeLibros.clear();
        Iterator it = listaAux.iterator();
        while(it.hasNext())
        {
            listadeLibros.add((Libro)it.next());
        }
    }
    public Libro LibroMasAntiguo()
    {
         return Collections.min(listadeLibros, new ComparadorFecha());
    }
    public Libro LibroMasReciente()
    {
         return Collections.max(listadeLibros, new ComparadorFecha());
    }
    public Libro LibroMasCaro()
    {
        return Collections.max(listadeLibros, new ComparadorPrecio());
    }
    public Libro LibroMasBarato()
    {
        return Collections.min(listadeLibros, new ComparadorPrecio());
    }
    
    @Override
    public String toString() {
        String salida = "";
        for(Libro libro: listadeLibros){
            salida += libro + "\n";
        }
        return salida;
       
    }
    
    
}
