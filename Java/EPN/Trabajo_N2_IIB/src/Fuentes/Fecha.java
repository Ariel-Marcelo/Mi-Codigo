package Fuentes;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class Fecha {
    
    private String dia,mes,año;
    private boolean fechaValida;
    public Fecha(String fecha){
        setFecha(fecha);
    }
    public void setFecha(String fecha)
    {
        Pattern ts = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher mr = ts.matcher(fecha);
        fechaValida = mr.matches();
        if(fechaValida){
            StringTokenizer tokens = new StringTokenizer(fecha,"/");
            this.dia = tokens.nextToken();
            this.mes = tokens.nextToken();
            this.año = tokens.nextToken();
        }else{
            JOptionPane.showMessageDialog(null,"Error, Formato Fecha Incorrecto");
        }
    }
    public boolean fechaValida(){
        return fechaValida;
    }  
    @Override
    public String toString() {
        return "\n" + "dia= " + dia + ", mes= " + mes + ", año= " + año;
    }
    
}
