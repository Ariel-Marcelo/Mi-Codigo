
package Herencia;

import java.util.ArrayList;


public class ListaDeEmpleados {
    private ArrayList <Empleado> listaEmpleados;

    public ListaDeEmpleados(){
        this.listaEmpleados = new ArrayList();
    }
    
    public void addEmpleado(Empleado empleado)
    {
        this.listaEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Empleado empleado: listaEmpleados)
        {
            salida += empleado + "\n\n";
        }
        return salida;
    }
    
}
