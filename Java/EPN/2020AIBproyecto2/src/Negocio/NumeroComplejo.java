
package Negocio;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class NumeroComplejo {
    private float entera;
    private float imaginaria;
    private int a = 1;
    
    public NumeroComplejo(){
    }
    
    public NumeroComplejo(float entera , float imaginaria)
    {
        this.entera = entera;
        this.imaginaria = imaginaria;
        
    }

    public float getEntera() {
        return entera;
    }

    public void setEntera(float entera) {
        this.entera = entera;
    }

    public float getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(float imaginaria) {
        this.imaginaria = imaginaria;
    }
    public NumeroComplejo sumaComplejos(NumeroComplejo nC1)
    {
        NumeroComplejo numC = new NumeroComplejo();
        numC.entera = this.entera + nC1.entera;
        numC.imaginaria = this.imaginaria + nC1.imaginaria;
        return numC; 
    }
    
    public NumeroComplejo restaComplejos(NumeroComplejo nC2)
    {
        NumeroComplejo result = new NumeroComplejo();
        result.entera = this.entera - nC2.entera;
        result.imaginaria = this.imaginaria - nC2.imaginaria;
        return result;
        
    }
    
    

    @Override
    public String toString() { 
        return "NumeroComplejo{" + "entera=" + entera + ", imaginaria=" 
                + imaginaria + '}';
    }
    
    public void setNumeroComplejo(String a)
    {   
        
        String linea;
        linea = JOptionPane.showInputDialog("Separados por una coma ingrese "
                + "la parte entera y la parte imaginaria del " + a + " Complejo ");
        //String Tokenizer tokans= new StringTokenizer (linea); los datos se separan por espacios en blanco
        StringTokenizer tokens= new StringTokenizer (linea,",");
        try
        {
            this.entera= Float.parseFloat(tokens.nextToken());
            this.imaginaria = Float.parseFloat(tokens.nextToken());
        }
        catch(NumberFormatException e) // Comprueba si se ingreso un numero y si no el error se captura en e y ejecuta el catch
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar números");
            e.printStackTrace();
            setNumeroComplejo(a);
        }
       
    
    }
    public void setEcuacion()
    {
        String linea1;
        linea1 = JOptionPane.showInputDialog("Separados por una coma ingrese "
                + " " + a + " Complejo ");
        //String Tokenizer tokans= new StringTokenizer (linea); los datos se separan por espacios en blanco
        StringTokenizer tokens= new StringTokenizer (linea1,",");
        try
        {
            this.entera= Float.parseFloat(tokens.nextToken());
            this.imaginaria = Float.parseFloat(tokens.nextToken());
        }
        catch(NumberFormatException e) // Comprueba si se ingreso un numero y si no el error se captura en e y ejecuta el catch
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar números");
            e.printStackTrace();

        }
    }
}
