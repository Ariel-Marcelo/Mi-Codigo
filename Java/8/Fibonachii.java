public class Fibonachii{
  public static void main(String args[]){
 
   System.out.println("prueba for");
   int a = 0;
   int b = 1;
   int c = 0;
   
   
   System.out.print(a + ", ");
   System.out.print(b + ", ");

   for(c = 1; c <= 100; c = a + b){
    if(c < 100){   
     System.out.print(c + ", ");
     a = b;
     b = c;
   }else{
     System.out.println(c);
     a = b;
     b = c;
   } 
  }  
 }
}