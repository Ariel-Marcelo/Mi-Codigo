package Fuentes;

public class Autor {
    private String nombre;
    private Fecha fechaNacimiento;
  
    public Autor(String nombreAutor, Fecha fechaNacimiento)
    {
        setAutor(nombreAutor, fechaNacimiento);
    }
    public void setAutor(String nombreAutor, Fecha fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre= nombreAutor;
    }
    public String nombreAutor()
    {
        return nombre;
    }
    @Override
    public String toString() {
        return nombre + 
                ", fechaNacimiento: " + fechaNacimiento;
    }

   
    
    
}

