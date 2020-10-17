
package Fuentes;

public class Perro extends Animal {

    private String perro = "\nSoy un Perro";
    public Perro(String especie) {
        super(especie);
    }

    @Override
    public String hablar() {
        return perro + "y ladro";
    }

    @Override
    public String desplazarse() {
        return perro + "y me desplazo";
    }

    @Override
    public String jugar() {
        return perro + "y juego";
    }

    @Override
    public String alimentarse() {
        return perro + "y me alimento";
    }

    @Override
    public String dormir() {
        return perro + "y duermo";
    }

    @Override
    public String toString() {
        return super.toString() + dormir() + jugar() + desplazarse() + hablar() ;
    }
    
    
}
