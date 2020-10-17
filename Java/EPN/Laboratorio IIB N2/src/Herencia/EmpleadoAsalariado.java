
package Herencia;


public class EmpleadoAsalariado extends Empleado {
    
    private double salarioBásico;

    public EmpleadoAsalariado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
        super(nombre, fechaNacimiento, fechaIngreso);
    }

    public EmpleadoAsalariado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, double salarioBasico) {
        super(nombre, fechaNacimiento, fechaIngreso);
        this.salarioBásico = salarioBasico;
    }
    

    
    @Override
    public double getSalario() {
        return this.salarioBásico;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado\n" + super.toString()  + "\nSalario=" + salarioBásico;
    }
    
    

    
    
}
