package Source;
import java.util.Random;
import javax.swing.JOptionPane;
public class Vector {
    
    private int vector [];
    
    public Vector(int N)
    {
        vector = new int[N];
    }
    public void setVector()
    {
        Random numAleatrorio = new Random();
        for(int i = 0 ; i < vector.length; i++ )
        {
            this.vector[i] = numAleatrorio.nextInt(9)+1;    
        }
    }
    @Override
    public String toString() {
        String salida = "";
        for(int i = 0; i < this.vector.length; i++)
        {
            if(i==0){
                salida += "  V= " + this.vector[i] + "|";
            }else{
                salida += " " + this.vector[i] + "|";
            }
        }
        return salida;
    }
    
    
    public long  sumarElementos()
    {
        long suma =0;
        for(int i= 0; i<this.vector.length; i++)
        {
            suma += this.vector[i];
        }
        return suma;
    }
    public long sumaPrimos()
    {
        long suma = 0;
        for(int i = 0; i< this.vector.length; i++)
        {
            if(esPrimo(this.vector[i]))
            {
                suma+= this.vector[i];
            }
        }
        return suma;
    }
    public boolean esPrimo(int n)
    {
        int cont=0;
        for(int i = 1; i<= n; i++)
        {
            if(n%i==0)
            {
                cont++;
            }  
        }
        return (cont==2);
    }
    
    public int contarNumPerfecto()
    {
        int contador = 0; 
        for(int i = 0; i<vector.length;i++)
        {
            int a = vector[i];
            if(esNumPerfecto(a))
            {
                contador++;
            }
        }
        return contador;
    }
    
    public boolean esNumPerfecto(int a)
    {
        int sumaDivisores =1;
        if(a==sumaDivisores){
            return false;
        }
        for(int i = 2; i < a;i++)
        {
            if(a%i == 0)
            {
                int c = i;
                int b = sumaDivisores + c;
                sumaDivisores = b;
            }    
        }
        return sumaDivisores == a;
    }
    
    public void clasificarVector()
    {
        int aux;
        for(int i = 0; i < vector.length; i++ )
        {
            for(int j = i +1; j < vector.length; j++)
            {
                if(vector[i]>vector[j])
                {
                    aux = vector[j];
                    vector[j]= vector[i];
                    vector[i] = aux;
                }
            }
        }
    }
    
    public int numMayor()
    {
        int mayor = vector[0];
        
        for(int j = 1; j < vector.length; j++)
        {
            if(mayor < vector[j])
            {
               mayor = vector[j];
            }
        }
        
        return mayor;
    }
    public int numMenor()
    {
        
        int menor = vector[0];
   
        for(int j = 1; j < vector.length; j++)
        {
                
            if(menor > vector[j])
            {
                menor = vector[j];
            }
        }
       
        return menor;
    }
        
    
    public int busquedaBinaria(int num)
    {
         clasificarVector();
         int longitud = vector.length;
         int indiceS = longitud -1;
         int indiceI = 0;
        
        try
        {
            do
            {
                int indiceM = indiceS - indiceI; 
                if(num < vector[indiceM])
                {    
                    indiceS = indiceM -1;
              
                }else{
                    if(num > vector[indiceM])
                    {
                        indiceI = indiceM + 1; 
                    }else{
                    
                        if(num == vector[indiceS])
                        {
                            return indiceS;
                        }else{
                            if(num == vector[indiceI])
                            {
                                return indiceI; 
                            }else{
                                indiceS = longitud + 1;
                            }
                        } 
                    }
                }
            
            }while( indiceS  != longitud + 1); 
        
            int error = vector[indiceS];
         
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Numero no encontrado");
            
        }
        return indiceS;
       
    }
    

}

