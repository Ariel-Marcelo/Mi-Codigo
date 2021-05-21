package Herencia;
public abstract class  Empleado extends Persona{
    
    Fecha fechaIngreso;

    public Empleado(String nombre, Fecha fechaNacimiento) {
        super(nombre, fechaNacimiento);
        
    }

    public Empleado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
        super(nombre, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }
    
    public abstract double getSalario();
    
    public abstract String getNombre();
    
    

    @Override
    public String toString() { // es un método polimorfico porque será definido nuevamente en cada sub-clase
        return  super.toString() + "\nfechaIngreso: " + fechaIngreso;
    }
   
}
