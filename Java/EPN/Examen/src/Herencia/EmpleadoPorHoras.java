package Herencia;
public class EmpleadoPorHoras extends Empleado{
    
    private double numHoras;
    private double costoHoras;

    public EmpleadoPorHoras(String nombre, Fecha fechaNacimiento,
                        Fecha fechaIngreso,double numHoras, double costoHoras){
        
        super(nombre, fechaNacimiento, fechaIngreso);
        this.numHoras = numHoras;
        this.costoHoras = costoHoras;
    }

    @Override
    public double getSalario() {
        return this.numHoras *this.costoHoras;
    }

    @Override
    public String toString() {
        return "Empleado Por Horas\n" +  super.toString() + "\nnumHoras=" + numHoras + 
                "\ncostoHoras=" + costoHoras + "\nsalario="+ getSalario();      
    }
}
