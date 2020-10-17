
package Fuentes;


public abstract class Profesor extends Persona{
    String titulo;
    Fecha fechaIngreso;
    
    public Profesor(String nombre, Fecha fechaNacimiento, String titulo, Fecha fechaIngreso) {
        super(nombre, fechaNacimiento);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }
    
    public abstract double getSalario();

    @Override
    public String toString() {
        return  super.toString() + "\ntitulo= " + titulo + "\nfechaIngreso: " + fechaIngreso;
    }
    
    
}
