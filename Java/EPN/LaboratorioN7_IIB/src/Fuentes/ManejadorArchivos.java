package Fuentes;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class ManejadorArchivos {
    
    File fe;
    File fo;
    BufferedReader entrada;
    BufferedWriter salida;
    Numero numero;
    
    public ManejadorArchivos() throws IOException
    {
        numero = new Numero();
        fe = new File("C:\\Users\\user\\Desktop\\Dato.txt");
        fo= new File("salida.txt");
        entrada = new BufferedReader(new FileReader(fe));
        salida = new BufferedWriter(new FileWriter(fo, true));//crea uno nuevo si pongo true entonces agrego registros al anterior
    }
    
    public void operar() throws IOException
    {
        int factorial;
        int numero1;
        String linea="";
        try 
        {
            
            while(entrada.ready())
            {
                linea=entrada.readLine();
                Pattern pat = Pattern.compile("[\\d,]+");
                Matcher mat = pat.matcher(linea);
                if(mat.matches())
                {
                    StringTokenizer tokens = new StringTokenizer(linea,",");
                    while(tokens.hasMoreTokens()){
                        numero1 = Integer.parseInt(tokens.nextToken());
                        this.numero.setNumero(numero1);
                        factorial = numero.factorialNumero(); 
                        salida.write("El factorial de "+ numero1 +" es:"+ factorial + "\n");
                        salida.newLine();
                    }
                }else{
                
                salida.write("No se encontro un numero");
                }
                
                
            }
            
            salida.write('\n');
            //salida.close();
        }catch(IOError e){
            
            e.printStackTrace();
        } 
    }
    
    public String leer(String path)
    {
        String texto ="";
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(new File(path)));
            while (bf.ready()){
            
                texto  += bf.readLine();
                texto += "\n";
            }
        }catch(Exception e ){
            System.out.println("No se encontro el archivo");
        }
        return texto;
    }
    
    
}