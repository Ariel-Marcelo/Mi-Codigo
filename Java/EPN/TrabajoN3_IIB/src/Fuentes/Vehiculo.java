
package Fuentes;


public class Vehiculo {

    private final String color;
    private final String matricula; 
    private final String modelo;
    private final int  idVehiculo;
    private static int contador = 1;
    public Vehiculo(String color, String matricula,String modelo)
    {
        this.color = color;
        this.matricula = matricula;
        this.modelo = modelo;
        idVehiculo = contador;
        contador++;
    }

    @Override
    public String toString() {
        return "Vehiculo " + idVehiculo +": color= " + color 
                + ", matricula=" + matricula + ", modelo=" + modelo;
    }

    
}
