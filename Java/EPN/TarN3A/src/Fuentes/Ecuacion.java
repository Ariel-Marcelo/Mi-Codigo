
package Fuentes;


public class Ecuacion {
    private String n;
    
    public Ecuacion(){}
    public Ecuacion(String n)
    {
        this.n = n;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Sea n = " + n + ", tus respuesta es: " + resolverEcuacion() +"\n";
    }
    
    public float resolverEcuacion()
    { 
        float i = Float.parseFloat(this.n);
        float resultado = 0;
        float x = i,ifac = 1;
        if(x < 0)        
        {
          x = -1*(x);
        }
        if(x == 0 || x == 1|| x ==2){
            return 1;
        }
        for(int indice = 3; indice <= x; indice++)
        {     
            for(int indice2 = 1; indice2 <= i; indice2++)
            {
                float a,c;
                c = indice2;
                a = ifac*c;
                ifac = a;     

            }
            float a;
            a = resultado + (i/(ifac)) ;
            resultado = a;
            i--;
            ifac=1;
        }
        
        
        return resultado + 2;
    }
}
