public class Formato{
  public static void main(String args[]){
   int w, x, y, z;
   int i = 4, j = 5;
   {  j = 7;
      i = 6;
      w = i + j;
      System.out.println(w + "= w  ");
   }
   
   x = i +j;
   System.out.println(x + "= x  ");
   { i = 8;
     y = i + j;
     System.out.println(y + "= y ");
   }
   z = i +j;
   System.out.println(z + "= z  ");
 }
}