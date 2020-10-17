
package Fuentes;

import java.util.Random;
import javax.swing.JOptionPane;

public class Matriz {
    
    private int[][] matriz;
    
    
    
    public Matriz(int N,int M)
    {
        matriz= new int[N][M];
    }
    public void setMatriz()
    {
        Random r= new Random();
        for(int i=0; i < this.matriz.length; i++)
        {
            for(int j=0; j < this.matriz[i].length; j++)
            {    
                this.matriz[i][j] = r.nextInt(9)+1;
            }
        }
    }

    @Override
    public String toString() {
        String salida="";
        for(int i = 0; i < this.matriz.length; i++)
        {
            for(int j = 0; j<this.matriz[i].length; j++ )
            {
                salida+= this.matriz[i][j] + "  "; 
            }
            salida+= "\n";
        }
        return salida;
    }
    
    public Matriz sumarMatrices(Matriz B)
    {
        Matriz matrizC = new Matriz(this.matriz.length,this.matriz[0].length);
        if(sonIguales(B))
        {
            for(int i = 0; i < this.matriz.length; i++)
            {
                for(int j = 0; j < this.matriz[0].length; j++)
                {
                    
                    matrizC.matriz[i][j] = this.matriz[i][j] +  B.matriz[i][j];
                }
            }                
        }else{
              JOptionPane.showMessageDialog(null, "Numero de Filas y Columnas"
                      + " Desiguales, no se puede sumar estas Matrizes" );
              matrizC=null;
        }
        return matrizC;
  
    }
    
    public boolean sonIguales(Matriz B)
    {
        
        if(this.matriz.length == B.matriz.length)
        {
           for(int i = 0; i < this.matriz[i].length; i++)
            {    
                if(B.matriz[i].length == this.matriz[i].length)
                {
                    if(i == this.matriz.length - 1);
                    {
                        return true;
                        
                    }
                    
                }else{
                    return false;
                }
            }
        }
        return false;
        
    }

    public Matriz multiplicarMatrices(Matriz B)
    {
        Matriz matrizAB = new Matriz(this.matriz.length , B.matriz[0].length);
        if(mismaFilaColumna(B)){
            for(int i = 0; i < this.matriz.length; i++)
            {
                for(int j = 0; j < B.matriz[0].length; j++ )
                {
                    for(int k = 0; k < B.matriz.length; k++ )
                    {
                        int a = this.matriz[i][k]* B.matriz[k][j];
                        int c = matrizAB.matriz[i][j] + a;
                        matrizAB.matriz[i][j] = c;
                        
                    }
                    
                }
                
            }
        }else{
            matrizAB = null;
        }
        return matrizAB;   
    }
    
    public boolean mismaFilaColumna(Matriz B)
    {
        int filasA = this.matriz[0].length;
        int columnasB = B.matriz.length;
        if(filasA == columnasB)
        {
            return true;
            
        }
        return false;
        
    }
   
    
    public void matrizXescalar(int a)
    {
        for(int i = 0;  i< this.matriz.length; i++ )
        {
            for(int j = 0; j < this.matriz[i].length; j++)
            {
                this.matriz[i][j] = this.matriz[i][j]*a;
            }
        }
    }
    
    public int sumarDiagonalSecundaria()
    {
        int resultado = -1;
        if(FilasColumnasIguales())
        {
            resultado = 0;
            int extremo = this.matriz.length - 1;
            for(int i = 0; i < this.matriz.length; i++ )
            {
                int c = resultado + this.matriz[i][extremo];
                resultado = c;
                extremo--;
            }
            
        }
        return resultado;
    }
    public int sumarDiagonaPrincipal()
    {
        int resultado = -1;
        if(FilasColumnasIguales())
        {
            resultado = 0;
            for(int i = 0; i < this.matriz.length ; i++)
            {
                int c = this.matriz[i][i] + resultado;
                resultado = c;
            }
        }
        return resultado;
    }
    public boolean FilasColumnasIguales()
    {
        int filas = this.matriz.length;
        int columnas = this.matriz[0].length;
        if(filas==columnas)
        {
            return true;
        }
        return false;
    }

    
}
