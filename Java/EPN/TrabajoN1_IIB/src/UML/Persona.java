
package UML;

public abstract class Persona implements IActor {

    public Persona() {
    }
    // no es oligatorio para persona implementar los metodos
    // de IActor
    public abstract void metodoPersona();
    
    public void metodoPersonaNoHereddado()
    {
        
    }
    
    public  void  metodoHeredadoPersona()
    {
    }
}
