package pkdg2020albproyecto1;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Número {
    private int  x;
    
    public Número() {
        this.x = 0;
    }   
    public Número(int x) {
        this.x = x;
    }  
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public boolean esParX(){//metodo predicado es al que se le  hace una consulta
        return this.x%2==0;
    }
    @Override
    public String toString() {
        return "N\u00famero{" + "x=" + x + '}';
    }
    
    public void setNumero()
    {
        String x = "";
        try
        {
            x = JOptionPane.showInputDialog("Ingresa un número entero");
            this.x = Integer.parseInt(x);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar numeros enteros");
            setNumero();
        }
    }
    public boolean esPrimo(){
        if(x>0){
            for(int i = 2; i == x ; i++){
                if( x%i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public int SumatoriaDigitos()
    {
        int op1 = this.x;
        int op2 = 0,result = 0;
        if(op1 == 0){
            return 0;
        }
        while(op1 != 0){
            int a = op1%10;
            op1 = op1/10;
            result = a + op2;
            op2 = result;    
        }
        return result;
    }
    
    public boolean esPerfecto(){
        int a = 0,b = 0,c = 0;
        for(int i = 2; i <= x; i++)
        {
            if(i!=x)
            {
                if(x%i == 0)
                {
                a=i;
                c=a+b;
                b=c;
                }      
            }else{
                if(c+1 == x)
                {
                    return true;
                }else
                {
                    return false;
                }
            }
        }
        return false;
    }
    public long Factorial()
    {
            int a = 1,c,e = 1;
            if(x > 1){
                a = x;
            }
            if(x < -1)
            {
                a = -x;    
            }
            for(int i = 2; i <= a; i++)
            {
                if(i != a){
                    c=e*i;
                    e=c;
                }else{
                    return x*e;
                }
            }
            return 1;  
    }
    
    
    
    public int Eleccion( )
    {
        String elec;
        int variable = 0;
        elec = JOptionPane.showInputDialog("Elige que hacer con el " + this.x +" Escribe el numero de una de las siguientes opciones; " + "\n" 
            + "1.-Calcular sumatoria de los digitos del número ingresado"+"\n"
            + "2.-Consultar si es un numero perfecto" + "\n"
            + "3.-Calcule el factorial del número");
        try{
            variable = Integer.parseInt(elec);
        }catch(NumberFormatException  e){
            JOptionPane.showMessageDialog(null, "Ingrese un numero que represente una de las opciones planteadas");
            Eleccion();
        }
        return variable;
    }
}


