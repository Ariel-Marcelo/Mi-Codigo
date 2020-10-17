
package Herencia;

import interfaces.JFEmpleado;
import java.io.IOException;
public class Main {

    
    public static void main(String[] args) throws IOException {
        //JFEmpleado empleado = new JFEmpleado();
        //empleado.setVisible(true);
        ManejadordeArchivos mane = new ManejadordeArchivos();
        mane.recolectarEmpleado();
        
  
    }

    
    
}
