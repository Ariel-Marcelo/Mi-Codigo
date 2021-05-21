package Fuentes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class Fecha {   
    private int dia, mes, año;
    private boolean fechavalida;
    public Fecha(String fecha)
    {
       setFecha(fecha);
    }       
    public void setFecha(String fecha)
    {
        Pattern prueba = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher mr = prueba.matcher(fecha);
        fechavalida = mr.matches();
        if(fechavalida){    
            StringTokenizer tk = new StringTokenizer(fecha,"/");
            this.dia = Integer.parseInt(tk.nextToken());
            this.mes = Integer.parseInt(tk.nextToken());
            this.año = Integer.parseInt(tk.nextToken());        
        }
    }
    
    public boolean ValidarFecha()
    {
        return fechavalida;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    

    @Override
    public String toString() {
        return "dia: " + dia + ", mes: " + mes + ", año: " + año ;
    }
    
    
    
    
}
