
package Main;
import javax.swing.JOptionPane;

public class NewMain {


    public static void main(String[] args) {
        
        Ecuacion ecuacion1 = new Ecuacion();
        Ecuacion ecuacion2 = new Ecuacion();
        Ecuacion result = new Ecuacion();
        String imprimir = "";
        int decision;
        
        do
        {
            ecuacion1.setEcuacion("Ecuación 1");
            ecuacion2.setEcuacion("Ecuación 2");
            result = ecuacion1.sumaEcuacion(ecuacion2);
            imprimir += "\n Primera Ecuación  \n" + ecuacion1;
            imprimir += "\n Segundo Ecuación \n" + ecuacion2;
            imprimir += "\n Ecuación  Resultante =" + result;
            JOptionPane.showMessageDialog(null,imprimir);
            decision = JOptionPane.showConfirmDialog(null,"Deseas Ingresar mas valores", "Decición",JOptionPane.YES_NO_OPTION);
        
        }while(decision == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null,imprimir);
        
      
    }
}
