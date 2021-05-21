package Fuentes;

public abstract class Persona {
    String nombre;
    Fecha fechaNacimiento;
    
    public Persona(String nombre, Fecha fechaNacimiento)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\nPersona:" + "\nnombre: " + nombre 
         + "\nfechaNacimiento: " + fechaNacimiento;
    }
}
