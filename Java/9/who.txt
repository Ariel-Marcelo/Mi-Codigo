import java.util.Scanner;

public class who{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   String Name1 = "", Name2 = "";
   System.out.println("Dame el primer nombre");
   Name1 = in.nextLine();
   System.out.println("Dame el segundo nombre");
   Name2 = in.nextLine();
   if(Name1 == Name2){
    System.out.println(Name1 + " es igual a " + Name2);
  }else{
    System.out.println(Name1 + " es distinto a " + Name2);
  }
  
   System.out.println("Comom no es un bot demos inicio a la sesión ");
   System.out.println("ESCRIBE TU NOMBRE DE USUARIO");
   Name1 = in.nextLine();
   System.out.println("Ahora tu contrasña");
   Name2 = in.nextLine();
   if(Name1.equals("Ariel") && Name2.equals("hamburguesa")){
    System.out.println("");
    System.out.println("BIENVENIDO " + Name1);
  }else if(Name1.equals("Lily") && Name2.equals("Panchito")){
    System.out.println("Bienvenida " + Name1);
  }else{
    System.out.println("Usuario o contraseña incorrectos");
  }   
 }
}