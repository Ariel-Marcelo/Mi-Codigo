
package myproject;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class CadenaInvertida {
    
    public void invierte(){
        ArrayList <String> nuevo = new ArrayList();
        ArrayList <String> definitivo = new ArrayList();
        System.out.print("Ingrese una cadena cualquiera");
        Scanner sc = new Scanner(System.in);
        String cadenaOriginal = sc.nextLine();
        String entrada = cadenaOriginal;
        StringTokenizer tokenens = new StringTokenizer(entrada, " ");
        for(int i  = 0; tokenens.hasMoreTokens() ; i ++){
            nuevo.add(tokenens.nextToken());
        }
        
        char[]divide;
        for( String aux: nuevo)
        {
            divide = aux.toCharArray();
            char a = 'a';
            char b = 'b';
            int j = 0;
            int i = 0;
            for(i = divide.length - 1 ; i != j ; i--){
                
                a = divide[i];
                b = divide[j];
                divide[j] = a;
                divide[i] = b;
                j--;
            }
            
            definitivo.add(String.copyValueOf(divide));
            
        }
        
        System.out.print(definitivo.toString());
        
    }    
}
