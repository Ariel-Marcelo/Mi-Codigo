public class Fibonachii{
  public static void main(String args[]){
 
   System.out.println("prueba for");
   int i = 0,a = 0, b = 1, c = 0;
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
   
   System.out.println("metodo while");
   i = 0;
   a = 0;
   b = 1;
   c = 0; 
   while(i <= 11){
   if(i < 11){
    System.out.print(a + ", ");
     c = a + b;
     a = b;
     b = c;
  }else{
    System.out.println(a);
  }
   i++;
  }     
 }
}