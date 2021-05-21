
package Fuentes;
public class Estudiante {
    private String nombre;
    private long cedula;
    private float n1, n2, n3,n4 ;
    
    public Estudiante(){
    }
    public Estudiante(String nombre, long cedula, float n1, float n2, float n3)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        
    }
    public void setEstudiante(String nombre, long cedula, float n1, float n2, float n3)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "cedula = "+ cedula + "\n" +
                "Nota1 = " + n1 + "\n" +
                "Nota2 = " + n2 + "\n"+
                "Nota3 = " + n3;
    }
    public boolean aprueba()
    {
        float  r = n1 + n2 + n3;
        return r >= 24 && r <= 30;
    }
    
    public boolean Entre0y10(float i)
    {
        this.n4 = i;
        return n4 >= 0 && n4 <= 10;
    }
    
    
}
