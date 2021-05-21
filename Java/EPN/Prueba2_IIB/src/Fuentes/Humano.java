
package Fuentes;


public abstract class Humano implements AccionesHumano, AccionesGeneral {
    
    private String nombre;
 
    public Humano(String nombre) {
        this.nombre= nombre;
    }

    @Override
    public String toString() {
        return "Mi nombre es: " + nombre + "soy Humano\n" ;
    }

    @Override
    public String bailar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tocarInstrumentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String estudiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String trabajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
