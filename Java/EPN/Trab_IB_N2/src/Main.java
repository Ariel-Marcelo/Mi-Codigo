
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner("456");
        int [] ar = new int[10];
        for(int i=1; i<=3; i++){
            ar[i] = sc.nextInt();
            
        }
        
        System.out.print(Arrays.toString(ar));
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
