
package pkg2020aibproyecto10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExpresionRegular {
    
    public void ejercicio1()
    {
        String opcion;
       
           Pattern pat = Pattern.compile("(.+,)+");
        do{
            System.out.println("Ejercicio1:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("ADMITIDA");
            }else{
                System.out.println("DENEGADA");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        /*
        Pattern pat2 = Pattern.compile(".*abc.*");
        do{
            System.out.println("Ejercicio2:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat2.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("Si ya que tienes el conjunto de caracteres abc "
                        + " en alguna parte de la cadena");
            }else{
                System.out.println("No cumple devido a que no tiene el conjunto de "
                        + " caracters abc ");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        Pattern pat3 = Pattern.compile("^abc.*");
        do{
            System.out.println("Ejercicio3:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat3.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("La cadena empieza con abc");
            }else{
                System.out.println("La cadena no empieza con abc");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        Pattern pat4 = Pattern.compile("^[aA]bc.*");
        do{
            System.out.println("Ejercicio4:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat4.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("La cadena esmpieza con abc o Abc");
                
            }else{
                
                System.out.println("La cadena no esmpieza con abc o Abc");
                
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        Pattern pat5 = Pattern.compile("[a-zA-Z]{5,10}");
        do{
            System.out.println("Ejercicio5:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat5.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("La cadena solo contiene letras entre entre 5 y 10");
                
            }else{
                
                System.out.println("La cadena no contiense solo letras o contiene mas de 10 o menos de 5");
                
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
       */
        
        Pattern pat6 = Pattern.compile("^[^\\d].*");
        do{
            System.out.println("Ejercicio6:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat6.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("No empieza por un digito");
            }else{
                System.out.println("Empieza con un dígito");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        /*
        
        Pattern pat7 = Pattern.compile(".*[^\\d]$");
        do{
            System.out.println("Ejercicio7:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat7.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("No acaba con un dígito");
            }else{
                System.out.println("Acaba con un digito");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        
        Pattern pat8 = Pattern.compile("(a|b)+");
        do{
            System.out.println("Ejercicio8:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat8.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("Tiene caracteres de solo a o b");
            }else{
                System.out.println("Tiene caracteres distintos de a o b");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        
        Pattern pat9 = Pattern.compile(".*1(?!2).*");
        do{
            System.out.println("Ejercicio9:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat9.matcher(cadena);
            if (mat.matches())
            {
                System.out.println(" No tiene un 2 despues del 1");
            }else{
                System.out.println("tiene un 2 despues del 1");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        Pattern pat10 = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        do{
            System.out.println("Ejercicio10:");
            Scanner sc= new Scanner(System.in);
            String cadena= sc.nextLine();
            Matcher mat = pat10.matcher(cadena);
            if (mat.matches())
            {
                System.out.println("El correo es completamente valido ");
            }else{
                System.out.println("El correo es invalido");
            }
            System.out.println("continua? si/no");;
            opcion= sc.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
        
        System.exit(0);
        */
    }
    
}
