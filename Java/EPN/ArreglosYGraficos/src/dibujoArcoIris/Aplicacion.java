/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujoArcoIris;
import javax.swing.JFrame;
import Interfaces.JPDibujoArcoiris;

public class Aplicacion {

    
    public static void main(String[] args) {
       JPDibujoArcoiris arcoiris = new JPDibujoArcoiris();
       JFrame aplicacion = new JFrame();
       
       aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       aplicacion.add(arcoiris);
       aplicacion.setSize(400,250);
       aplicacion.setVisible(true);
       
    }
    
}
