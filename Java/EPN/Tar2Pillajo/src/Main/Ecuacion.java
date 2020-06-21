
package Main;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class Ecuacion {
    private double a;
    private double b;
    private double c;
    
    public Ecuacion(){
    }
    public Ecuacion(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Ecuacion sumaEcuacion(Ecuacion ecuacion1)
    {
        Ecuacion result = new Ecuacion();
        result.a = ecuacion1.a + this.a;
        result.b = ecuacion1.b + this.b;
        result.c = ecuacion1.c + this.c;
        return result;
    }
   
    @Override
    public String toString() {
        return  a + "x[2] +" + "("+b+"x) " + "+ ("+ c +")";
    }
    
    public void setEcuacion(String t)
    {
        String Valores = JOptionPane.showInputDialog("Porfavor ingresar los "
                + "numeros a,b,c en este orden y separados por comas para la "
                + "la " + t);
        StringTokenizer tokens = new StringTokenizer(Valores,",");
        try
        {
            this.a = Double.parseDouble(tokens.nextToken());
            this.b = Double.parseDouble(tokens.nextToken());
            this.c = Double.parseDouble(tokens.nextToken());
           
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Ingrese solamente número "
                    + "separados por comas");
            setEcuacion(t);
           
        }
    }
    
}
