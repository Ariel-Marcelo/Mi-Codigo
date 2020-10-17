package Fuentes;
public class Libro {
    private Autor autor;
    private Fecha fechaEdición;
    private String titulo;
    private double precio;
    
    public Libro(Autor datosAutor, Fecha fechaEdicion, String tituloLibro, double precio)
    {  
        setLibro(datosAutor, fechaEdicion, tituloLibro, precio);
        
    }
    public void setLibro(Autor datosAutor, Fecha fechaEdicion, String tituloLibro, double precio)
    {
        this.fechaEdición = fechaEdicion;
        this.titulo = tituloLibro;
        autor = datosAutor;
        this.precio = precio;   
    }
    public Autor getAutor() {
        return autor;
    }
    public Fecha getFechaEdición() {
        return fechaEdición;
    }
    public String getTitulo() {
        return titulo;
    }
    public double getPrecio() {
        return precio;
    }
    @Override
    public boolean equals(Object o1) {
        if (o1 instanceof Libro) {
            Libro LibrosCreados = (Libro)o1;
            return this.titulo.equals(LibrosCreados.titulo);
        } else {
            return false;
        } 
    }
    @Override
    public int hashCode() {
        return 1;
    }
    

    @Override
    public String toString() {
        
        return "Libro: "+ "´"+ titulo + "´" 
             + "\n autor: " + autor + "\n fechaEdición: " 
             + fechaEdición + "\n Precio: " + precio;
    }
    
    
           
}
