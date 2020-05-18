public class Series{
  public static void main(String args[]){

   System.out.println("Usando el metodo for");   
   int i = 0;
   int a = 99;
   for(i = 1; i <= 10; i++){
    if( i < 10){  
     System.out.print(i + ", ");
   } else {
     System.out.println(i);
   }
  }
    for( i = 1; i <= 5; i++){
    if( i < 5){
     System.out.print(i + ", ");
     System.out.print(a + ", ");
     a--;   
   }else{
     System.out.print(i + ", ");
     System.out.println(a);
   }
  }
    System.out.println("Usando el metodo while");
    i = 1;
    while( i <= 10){
    if( i < 10){
     System.out.print(i + ", ");
     i++;
   } else {
     System.out.println(i);
     i++;
   } 
  }
    a = 99;
    i = 1;
    while(i >= 95){
     System.out.print(i + ", ");
     if(i > 95){
     i++;
      System.out.print(a + ", ");
      a--;
    }else{
      System.out.println(a);
      a--;
    }  
   }
    System.out.println("Usando el metodo do-while"); 
    i = 1;
    do{
     if(i<10){
     System.out.print(i + ", ");
     i ++;
   } else {
     System.out.println(i);
     i++;
   }    
  }while(i <= 10);
 }
}