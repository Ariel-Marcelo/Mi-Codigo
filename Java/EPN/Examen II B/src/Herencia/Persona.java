package Herencia;
public abstract class Persona {
    Fecha fechaNacimiento;
    String nombre;
    
    public Persona(String nombre, Fecha fechaNacimiento)
    {
        setPersona(nombre, fechaNacimiento);
    }
    public  void setPersona(String nombre, Fecha fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona: \n" + "nombre: " + nombre +  "\nfechaNacimiento: " + fechaNacimiento  ;
    }
    
    
}
