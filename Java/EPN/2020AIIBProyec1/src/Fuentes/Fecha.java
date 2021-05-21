
package Fuentes;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
public class Fecha {
    private int dia, mes, año;
    public Fecha(String fecha)
    {
        setFecha(fecha);
    }
    public void setFecha(String fecha)
    {
        Pattern expresion = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher comparacion = expresion.matcher(fecha);
        if(comparacion.matches()){          
            StringTokenizer ts = new StringTokenizer(fecha, "/");
            dia = Integer.parseInt(ts.nextToken());
            mes = Integer.parseInt(ts.nextToken());
            año = Integer.parseInt(ts.nextToken());
        }else{
            
            JOptionPane.showMessageDialog(null, "Formato de Fecha Incorrecto");
        }
    }
    @Override
    public String toString() {
        return "dia: " + dia + 
               "\nmes: " + mes + 
               "\naño:" + año ;
    }
    
    
    
    
}
