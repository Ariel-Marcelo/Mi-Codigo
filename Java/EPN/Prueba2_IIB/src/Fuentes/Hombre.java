package Fuentes;


public class Hombre extends Humano{
    
    String hombre;
    
    public Hombre(String nombre) {
        super(nombre);
        
    }
    

    @Override
    public String bailar() {
        return "\nSoy "+ hombre + "y bailo ";
    }

    @Override
    public String tocarInstrumentos() {
        return "\nSoy "+ hombre + "y toco instrumentos ";
    }

    @Override
    public String estudiar() {
        return "\nSoy "+ hombre + "y estudio ";
    }

    @Override
    public String trabajar() {
        return  "\nSoy "+ hombre + "y trabajo ";
    }

    

    @Override
    public String hablar() {
        return  "\nSoy "+ hombre + "y hablo ";
    }

    @Override
    public String desplazarse() {
        return  "\nSoy "+ hombre + "y me desplazo ";
    }

    @Override
    public String jugar() {
        return  "\nSoy "+ hombre + "y juego ";
    }

    @Override
    public String alimentarse() {
        return  "\nSoy "+ hombre + "y me alimento ";
    }

    @Override
    public String dormir() {
        return  "\nSoy "+ hombre + "y duermo ";
    }
    
    @Override
    public String toString() {
        return "\n"+ super.toString() + estudiar() + trabajar() 
                + bailar() + tocarInstrumentos() + hablar() + desplazarse()
                + jugar() + alimentarse() + dormir() ;
    }
}
