
package Fuentes;

public class Empleado {
    
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    String nombre;
    public Empleado(Fecha fechaEntrada, Fecha fechaSalida, String nomEmpleado)
    {
        setEmpleado(fechaEntrada, fechaSalida, nomEmpleado);
       
    }
    
    public void setEmpleado(Fecha fechaEntrada, Fecha fechaSalida, String nomEmpleado)
    {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.nombre = nomEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado:\n " + nombre + "\n" +
                "Fecha Entrada: \n" + fechaEntrada + 
                "\nFecha Salida: \n" + fechaSalida + "\n";            
    }
    
    
}
