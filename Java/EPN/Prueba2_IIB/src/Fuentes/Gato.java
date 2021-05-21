
package Fuentes;


public class Gato extends Animal {

    private String gato = "\nSoy un gato";
    public Gato(String especie) {
        super(especie);
    }

    @Override
    public String hablar() {
         return gato + "y maullo";
    }

    @Override
    public String desplazarse() {
        return gato + "y despazo"; 
    }

    @Override
    public String jugar() {
        return gato + "y juego";
    }

    @Override
    public String alimentarse() {
        return gato + "y me alimento";
    }

    @Override
    public String dormir() {
        return gato + "y duermo";
    }
    
    @Override
    public String toString()
    {   
        return super.toString() + dormir() + jugar() + desplazarse() + hablar();
    }
    
}
