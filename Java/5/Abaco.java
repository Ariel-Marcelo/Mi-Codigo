import  java.util.Scanner; 
public class Abaco{
  public static void main(String args[]){
   
   Scanner pi = new Scanner(System.in); 
   String nombre = "";                      
   int valor1 = 0, valor2 = 0, resultado = 0;

   System.out.println("¿Cuál es tu nombre?");
   nombre = pi.nextLine(); 

   System.out.println("dame el primer valor: ");
    valor1 = pi.nextInt();

   System.out.println("dame el segundo valor: ");
   valor2 = pi.nextInt();

   resultado = valor1 + valor2;
   
   System.out.println("El resultado de tu suma es: " + resultado);
 }
}