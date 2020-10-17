
package UML;


public abstract class Vehiculo implements IActor, IObjetoInerte {
    
    int b = Vehiculo.atributoInterface;
    this.atributoInterface = 1; // no permite cambiar el valor 
    int c = Vehiculo.atributoSegundaInterface; 
// puede realizar implementacion de varios atributos de 
    // distintas clases como si le pertenecieran a la misma clase.
    public void metodoNoHerdado()
    {
        int a = b + c; // puede usar ambos métodos
    }

    

   
 

    
}
