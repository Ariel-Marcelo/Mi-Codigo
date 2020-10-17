/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;
public class ListaEncadenada {

    LinkedList <Integer> listaEnlazada;
    public ListaEncadenada() {
      this.listaEnlazada = new LinkedList();
    }
    public boolean estaVacia()
    {
        return this.listaEnlazada.isEmpty();
    }
    public void addInicio(Empleado empleado)
    {
           listaEnlazada.addFirst(empleado);  
    }
    public void addFinal(Empleado empleado)
    {
        listaEnlazada.addLast(empleado);
    }
    public void addOrdenar ()
    { 
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "NO existen elementos para ordenar");
        }else{
            Collections.sort(listaEnlazada, new ComparaNombres());
        }
    }
    public String borrarEmpleadoPorNombre(String empleado){
        ListIterator <Empleado> it1 = listaEnlazada.listIterator();
        String salida = "Elemento No encontrado";
        while(it1.hasNext())
        {  
            if(it1.next().getNombre().compareToIgnoreCase(empleado) == 0){
                it1.remove();
                salida = "Elemento eliminado";
            }     
        }
        return salida;
    }
    public Empleado mayorSueldo()
    {
        return Collections.max(listaEnlazada, new CompararSueldo());
    }
    @Override
    public String toString() {
        String salida = "";
        if (estaVacia())
        {
            return "Lista Vacia";
        }else{
            salida +=  "La LISTA Empleado es:";
            for(Empleado empleado: listaEnlazada)
            {
                salida += empleado.toString() + "\n";
            }
            return salida;
        }
    }

}
