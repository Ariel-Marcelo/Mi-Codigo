package Fuentes;
public class Numero {
    int numero;
    public Numero()
    {
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int factorialNumero()
    {
        int factorial = numero;
        if(numero == 0)
        {
            return 1;
        }else
        {
            int aux= factorial - 1;
            while ( aux!=0) {
                
                factorial=aux*factorial;
                aux--;
            }
        }
        return factorial;
    }
    
    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }
    
}
