import javax.swing.*; 
public class Interfaz extends JFrame{  
  private JLabel pantallazo;  

  public Interfaz(){ 
   setLayout(null); 
   pantallazo = new JLabel("Hola mundo"); 
   pantallazo.setBounds(30,20,200,300);  
   add(pantallazo);    
          
 }
  
  public static void main(String args[]){
   Interfaz inter = new Interfaz(); 
   inter.setBounds(0,0,100,300);
   inter.setVisible(true); 
   inter.setLocationRelativeTo(null); 
 }
}