
import javax.swing.JOptionPane;


public class Main {


    public static void main(String[] args) {
        
        Ecuacion miEcuacion = new Ecuacion();
        int respuesta;
        String imprimir ="";
        
        do{
            miEcuacion.setEcuacion();
            imprimir += miEcuacion.toString() + "\n";
            respuesta = JOptionPane.showConfirmDialog(null,"Ingresar otra "
                    + "ecuacion","Datos",JOptionPane.YES_NO_OPTION);
            
        }while(respuesta == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null,imprimir);
        
    }
    
}
