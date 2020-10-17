
package Fuentes;
import java.util.ArrayList;
public class ListaEmpleados {
    
    private ArrayList <Empleado> listaEmpleados;
    
    public ListaEmpleados()
    {
        listaEmpleados = new ArrayList();
    }
    
    public void setEmpleados(Empleado e)
    {
        listaEmpleados.add(e);
    }

    @Override
    public String toString() {
        String salida = "";
        int i = 0;
        for(Empleado empleado : listaEmpleados)
        {
           i++;
           salida += i +" " + empleado.toString();
        }
        return salida;
    }
    
    
}
