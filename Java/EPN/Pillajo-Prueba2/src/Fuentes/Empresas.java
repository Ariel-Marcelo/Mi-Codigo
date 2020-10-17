
package Fuentes;


import java.util.StringTokenizer;

public class Empresas {
    
    private String[]  matrizempresas;
    private String[][] matrizempleados;
    
    public Empresas (int N, int empleado)
    {
        matrizempresas= new String[N];
        matrizempleados= new String[N][empleado];   
    }
    
    public void setEmpresas(String nomEmpresa)
    {
        StringTokenizer tokens = new StringTokenizer(nomEmpresa, ",");
        for(int i = 0; matrizempresas.length > i; i++)
        {
                matrizempresas[i]= tokens.nextToken();
        }
    }
   
    public void setEmpleados(String nomEmpleados)
    {
        StringTokenizer tokens = new StringTokenizer(nomEmpleados, ",");
        
        for(int i = 0; matrizempleados.length > i; i++)
        {
            for(int j = 0; matrizempleados[0].length > j; j++){
                String a = tokens.nextToken();
                this.matrizempleados[i][j] = a;
                
            }
        }
 
    }

    @Override
    public String toString() {
        String salida="";
        for(int i = 0; i < this.matrizempleados.length; i++)
        {
            for(int j = 0; j<this.matrizempleados[i].length; j++ )
            {
                salida+= this.matrizempleados[i][j] + "  "; 
            }
            salida+= "\n";
        }
        
        for (int i = 0; i < matrizempresas.length; i++)
        {
            salida += this.matrizempresas[i] + " " ;
        }
        return salida;
    }
}
