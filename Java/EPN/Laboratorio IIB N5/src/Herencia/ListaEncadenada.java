
package Herencia;

import javax.swing.JOptionPane;


public class ListaEncadenada {
    Nodo inicio;

    public ListaEncadenada() {
      this.inicio=null;
    }
    
    public boolean estaVacia()
    {
        return (this.inicio == null);
    }
    public void addInicio(Empleado empleado)
    {
       if(estaVacia())
       {
           inicio = new Nodo(empleado);
           inicio = inicio.enlace;
       }else
       {
           Nodo nuevo = new Nodo(empleado);
           inicio.enlace = nuevo;
           nuevo.enlace=inicio;
           inicio=nuevo;
           
       } 
    }

    public void addFinal(Empleado empleado)
    {
        if(estaVacia())
        {
            inicio = new Nodo(empleado);
        }else{
            Nodo q,p;
            q=p=this.inicio;
            
                while(p != null)
                {
                    q = p;
                    p = p.enlace;
                }
                q.enlace = new Nodo(empleado);
        }
    }
    /*
    
    public void addFinal(Empleado empleado)
    {
        if(estaVacia())
        {
            inicio = new Nodo(empleado);
        }else{
            Nodo nuevo = new Nodo(empleado);
            Nodo aux = inicio;
            
                while(aux.enlace != null)
                {
                    aux = aux.enlace;
                }
                    aux.enlace = nuevo;
        }
    }
*/
    
    public void addOrdenar (Empleado empleado)
    { 
        if(estaVacia())
        {
            inicio = new Nodo(empleado);
        }else{
            Nodo a,b;
            a=b= this.inicio;
            Nodo nuevo = new Nodo(empleado);
            while(b !=null){
                if(empleado.getNombre().compareToIgnoreCase(
                    b.getDato().getNombre())> 0){
                    if(b == inicio){
                        nuevo.enlace = inicio;
                        inicio = nuevo;
                    }else{
                        nuevo.enlace= b.enlace;
                        b.enlace = nuevo;
                    }
                    break;
                }else{
                
                    a=b;
                    b=b.enlace;
                }
                if(b==null)
                {
                    a.enlace=nuevo;
                }
            }
        }
        
    }
    public String borrarEmpleadoPorNombre(Empleado empleado){
        boolean encontrado = false;
        String salida = "";
        if(estaVacia())
        {
            salida = "Lista Vacia";
        }else{
            Nodo a,b;
            a=b=this.inicio;
            while(a != null &&  encontrado == false){
                if(a.getDato().getNombre().compareToIgnoreCase(empleado.getNombre())==0){
                    if(a == inicio){
                        inicio = a.enlace;//El inicio debe saltar hacia su propio en
                    }else{                        
                        b.enlace = a.enlace;//b se enlaza con  da un  el enclace de a       
                    }
                    salida = "El empleado ha sido eliminado de la lista";
                    encontrado = true;
                    break;
                }else{ 
                    if(a.enlace == null){
                        salida = "No se ha podido encontrar el Empleado";
                    }
                    b=a;
                    a = a.enlace;
                }
            }
        }
        return salida;
    }

    @Override
    public String toString() {
        String salida = "";
        if (estaVacia())
        {
            return "Lista Vacia";
        }else{
            salida +=  "La LISTA Empleado es:";
            Nodo p = inicio;
            while(p!= null){
                salida += "\n" + p.getDato();
                p = p.enlace;
            }
            return salida;
        }
    }
    
    
}
