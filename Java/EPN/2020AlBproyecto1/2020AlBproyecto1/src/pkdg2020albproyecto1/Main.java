
package pkdg2020albproyecto1;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int option;
        int variable;
        String imprimir ="";
        
        Número numero = new Número();
        
        
        do{
            numero.setNumero();
            variable = numero.Eleccion();
           
            switch(variable){
                case 1:
                {
                    imprimir += "La suma de todos los digitos del número "
                           + numero.getX() + " es: " + numero.SumatoriaDigitos() + "\n";
                    JOptionPane.showMessageDialog(null,imprimir);
                    
                    break;
                }
                case 2:
                {
                    if(numero.esPerfecto()){
                    imprimir+= numero.getX() + " es un número perfecto"+"\n";
                    JOptionPane.showMessageDialog(null,imprimir);
                    
                    }else{
                    imprimir += numero.getX() + " no es un número perfecto" + "\n";
                    JOptionPane.showMessageDialog(null,imprimir);
                    
                    }
                    
                    break;
                }
                case 3:
                {
                    imprimir += "El factorial de " + numero.getX() + " es " 
                    + numero.Factorial()+ "\n";
                    JOptionPane.showMessageDialog(null,imprimir);
                    
                    
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"La opcion seleccionada no existe");
             
                }
            }
            option = JOptionPane.showConfirmDialog(null,"Desea continuar..?","Ingreso de Datos",JOptionPane.YES_NO_OPTION);
        }while(option == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,imprimir);
        
        
    }
}
