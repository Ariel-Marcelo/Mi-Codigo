
package UML;

import java.util.ArrayList;

public class ListaVehiculos {
    
    private ArrayList<Vehiculo> listaVehiculos;

    public ListaVehiculos() {
        listaVehiculos = new ArrayList();
    }

    public void addListaVehiculos(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Vehiculo vehiculo: listaVehiculos)
        {
            salida += vehiculo;
        }
        return salida;
    }
    
    
    
}
