import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Ecuacion {
    
    private float a;
    private float b;
    private float c;
    
    public Ecuacion(){
    }
    
    public Ecuacion(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }
    

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    @Override
    public String toString() {
        if(b<0 && c<0)
        {
            return "Tu Ecuacion es " + a + "x[2] " + b + "x " + c +" = 0 ";
        }
        
        if(b<0)
        {
            return "Tu Ecuacion es " + a + "x[2] " + b + "x + " + c +" = 0 ";
            
        }if(c<0)
        {
            return "Tu Ecuacion es " + a + "x[2] + " + b + "x " + c +" = 0 ";
            
        }else
        {
            return "Tu Ecuacion es " + a + "x[2] + " + b + "x + " + c +" = 0 ";
        }
    }
    
    public void setEcuacion()
    {
        String valores;
        valores = JOptionPane.showInputDialog("Ingresa los valores de la" +
                " ecuacion de la forma ax[2] + bx + c " +"\n" 
                +" Porfavor ingrese los valores separados"
                + " por una coma de la sguiente forma a,b,c");
        
        StringTokenizer tokens= new StringTokenizer (valores,",");
        try
        {
            this.a = Float.parseFloat(tokens.nextToken());
            this.b = Float.parseFloat(tokens.nextToken());
            this.c = Float.parseFloat(tokens.nextToken());
            
        }
        catch(NumberFormatException e) // Comprueba si se ingreso un numero y si no el error se captura en e y ejecuta el catch
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar numeros en "
                    + "el correcto orden especificado");
            setEcuacion();
        }
    
    }
    
    
}
