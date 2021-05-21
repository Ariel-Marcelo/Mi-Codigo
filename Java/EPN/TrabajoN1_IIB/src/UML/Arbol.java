
package UML;


public class Arbol extends Vegetal implements IActor {

    // Esta clase tiene que implementar y heredar varios metodos
    
    public Arbol() {
    }
    
    @Override
    public void metodoInterface() {
        int b = this.a; // se pueden usar atributos heredados de vegetal
    }

    @Override
    public void metodoVegetal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
