package Negocio;

import javax.swing.JOptionPane;


public class NewMain {


    public static void main(String[] args)
    {
        
        NumeroComplejo numComplejo = new NumeroComplejo();
        NumeroComplejo segundoComplejo = new NumeroComplejo();
        NumeroComplejo resultantComplejo = new NumeroComplejo();
        NumeroComplejo resultanteComplejo = new NumeroComplejo();
        NumeroComplejo ecuacion2 = new NumeroComplejo();
       // System.out.println(numcomplejo);// cuando imprimimos un system se encarga de transformar todo a string razon por la cual cuando intentamos imprimirel objeto de la clase NumeroComplejo nos aparece como si escribieramos el toString()
       // int opcion;
        String salida ="";
        /*
        do
        {
            numcomplejo.setNumeroComplejo();
            salida += numcomplejo.toString()+"\n";// += es como un x = x+y pero convierte a y al tipo de x para correr sin problemas 
            opcion = JOptionPane.showConfirmDialog(null , "Mas números Complejo?" , "Datos " , JOptionPane.YES_NO_OPTION);
        }while(opcion == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,salida); //Despliege la salida total antes preparada
        */
    numComplejo.setNumeroComplejo("Primer");
    segundoComplejo.setNumeroComplejo("Segundo");       
    resultanteComplejo = numComplejo.restaComplejos(segundoComplejo);
    resultantComplejo = numComplejo.sumaComplejos(segundoComplejo);
    
    
    salida += "\n Primer Complejo \n" + numComplejo.toString();
    salida += "\n Segundo Complejo \n" + segundoComplejo;
    salida += "---------------------" ;
    salida += "\n Suma Complejo \n" + resultantComplejo;
    salida += "\n La resta de Complejos es \n" + resultanteComplejo;
    JOptionPane.showMessageDialog(null,salida);
    
    
    
    }
    
    
}
