public class Promedio{
  public static void main(String args[]){ 
   int promedio_1 = 6;
   int promedio_2 = 10;
   int promedio_3 = 7;
   int resultado  = 0;

   resultado = (promedio_1 + promedio_2 + promedio_3) /  3;
   
   if(resultado >= 6){ 
    System.out.println("APROBADO su nota es: " + resultado);
  } else {
    System.out.println("REPROBADO su nota es: " + resultado);
  }
 }
}