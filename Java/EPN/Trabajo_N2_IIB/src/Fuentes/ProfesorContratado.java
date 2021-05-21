package Fuentes;

public class ProfesorContratado extends Profesor {    
    Fecha fechaSalida;
    double salarioFinal; 
    
    public ProfesorContratado(String nombre, Fecha fechaNacimiento, 
    String titulo, Fecha fechaIngreso, Fecha fechaSalida, double salarioFinal) {
 
        super(nombre, fechaNacimiento, titulo, fechaIngreso);
        this.fechaSalida = fechaSalida;
        this.salarioFinal = salarioFinal;
    }
    
    @Override
    public double getSalario() {
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Profesor Contratado" + super.toString() + "\nfechaSalida= " + fechaSalida 
        + "\nSalario al finalizar el contrato= " + salarioFinal;
    }

    
    
    
    
}
