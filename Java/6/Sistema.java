import java.util.Scanner;

public class Sistema{
  public static void main(String args[]){
   
   Scanner usuario = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("++++++++++++++++++++++++++++++++++++++++");
   System.out.println("Bienvenido al sistema Vacacional de Sony");
   System.out.println("++++++++++++++++++++++++++++++++++++++++");

   System.out.println("");
   System.out.println("Escribe tu nombre de Usuario");
   nombre = usuario.nextLine();
   System.out.println("Escribe los a�os que  llevas trabajando con Sony");
   antiguedad = usuario.nextInt();
   System.out.println("Escribe tu clave de Departamento");
   clave = usuario.nextInt();

   if(clave == 1){
    if(antiguedad == 0){
     System.out.println("Lo sentimos " + nombre + " de dise�o aun no es parte de la familia Sony vuelva cuando haya acumulado un a�o de trabajo por lo menos!!");
   } else if(antiguedad == 1){
     System.out.println("Usted " + nombre + " de dise�o possee 3 d�as de Vaciones habiles canjeelos ya!!");  
   } else if(antiguedad >= 2 && antiguedad <= 5){
     System.out.println("Usted " + nombre + " de dise�o possee 9 d�as de Vaciones habiles canjeelos ya!!");       
   } else if(antiguedad >=6 && antiguedad <= 54){
     System.out.println("Si lleva tanto tiempo su alma es nuestra " + nombre + " usted de dise�o possee 15 d�as de Vacaciones habiles canjeelos ya y si nos toma el pelo lo despediremos:)");
   } else {
     System.out.println("Porque sigue aqui? jubilese");
   }
  } else  if(clave == 2){
    if(antiguedad == 0){
     System.out.println("Lo sentimos " + nombre + " del equipo de proramacion aun no es parte de la familia Sony vuelva cuando haya acumulado un a�o de trabajo por lo menos!!");
   } else if(antiguedad == 1){
     System.out.println("Usted " + nombre + " del equipo de programacion possee 5 d�as de Vaciones habiles canjeelos ya!!");  
   } else if(antiguedad >= 2 && antiguedad <= 5){
     System.out.println("Usted " + nombre + " del equipo de programacion possee 13 d�as de Vaciones habiles canjeelos ya!!");       
   } else if(antiguedad >=6 && antiguedad <= 54){
     System.out.println("Si lleva tanto tiempo su alma es nuestra " + nombre + " usted del equipo de programacion possee 17 d�as de Vacaciones habiles canjeelos ya y si nos toma el pelo lo despediremos:)");
   } else {
     System.out.println("Porque sigue aqui? jubilese");
   }  
  } else if(clave == 3){
    if(antiguedad == 0){
     System.out.println("Lo sentimos " + nombre + " de la cocina aun no es parte de la familia Sony vuelva cuando haya acumulado un a�o de trabajo por lo menos!!");
   } else if(antiguedad == 1){
     System.out.println("Usted " + nombre + " de la cocina possee  d�as de Vaciones habiles canjeelos ya!!");  
   } else if(antiguedad >= 2 && antiguedad <= 5){
     System.out.println("Usted " + nombre + " de la cocina posee 9 d�as de Vaciones habiles canjeelos ya!!");       
   } else if(antiguedad >=6 && antiguedad <= 54){
     System.out.println("Si lleva tanto tiempo su alma es nuestra " + nombre + " usted de la cocina possee 15 d�as de Vacaciones habiles canjeelos ya y si nos toma el pelo lo despediremos:)");
   } else {
     System.out.println("Porque sigue aqui? jubilese");
   }     
  } else {
    System.out.println("la clave  es incorrecta vuelva a correr el programa please ");
  }
 }
}