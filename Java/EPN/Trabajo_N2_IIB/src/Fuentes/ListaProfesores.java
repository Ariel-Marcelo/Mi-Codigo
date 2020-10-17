
package Fuentes;

import java.util.ArrayList;

public class ListaProfesores {
    
    public ArrayList <Profesor> listaProfesores;
    
    public ListaProfesores()
    {
        listaProfesores = new ArrayList();
       
    }
    
    public void addProfesor(Profesor profesor)
    {
        listaProfesores.add(profesor);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Profesor profe: listaProfesores)
        {
            salida += profe.toString() + "\n\n";
        }
        return salida;
    }
    
    
}
