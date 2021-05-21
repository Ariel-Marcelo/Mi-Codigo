
package UML;

public interface IActor {

    // atributos static final
    int atributoInterface = 1;
    
    // permite sobreescribir métodos por defecto
    
    @Override
    public String toString();
    
    //no tiene constructor
    // sus metodos son abstractos
    
    public void metodoInterface();
}
