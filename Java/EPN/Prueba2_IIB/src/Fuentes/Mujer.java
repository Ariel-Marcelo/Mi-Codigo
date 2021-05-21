
package Fuentes;


public class Mujer extends Humano {

    private String mujer;

    public Mujer(String nombre) {
        super(nombre);
    }
    
    
    @Override
    public String trabajar() {
        return "\nSoy "+ mujer + "y bailo ";
    }

    @Override
    public String estudiar() {
        return "\nSoy "+ mujer + "y bailo ";
    }

    @Override
    public String tocarInstrumentos() {
        return "\nSoy "+ mujer + "y bailo ";
    }

    @Override
    public String bailar() {
        return "\nSoy "+ mujer + "y bailo ";
    }

    

    @Override
    public String hablar() {
        return "\nSoy "+ mujer + "y hablo ";
    }

    @Override
    public String desplazarse() {
        return "\nSoy "+ mujer + "y me desplazo ";
    }

    @Override
    public String jugar() {
        return "\nSoy "+ mujer + "y juego ";
    }

    @Override
    public String alimentarse() {
        return "\nSoy "+ mujer + "y me alimento ";
    }

    @Override
    public String dormir() {
        return "\nSoy "+ mujer + "y duermo ";
    }
    @Override
    public String toString() {
        return  "\n" + super.toString() + estudiar() + trabajar() 
                + bailar() + tocarInstrumentos() + hablar() + desplazarse() 
                + jugar() + alimentarse() + dormir() ;
    }
}
