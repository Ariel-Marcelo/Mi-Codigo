package Herencia;
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBasico;
    public EmpleadoBaseMasComision(String nombre, Fecha fechaNacimiento,
    Fecha fechaIngreso, double valorVendido, double porcentajeComision, double salarioBasico) {
        
        super(nombre, fechaNacimiento, fechaIngreso, valorVendido, porcentajeComision);
        this.salarioBasico=salarioBasico;
    }
    
    public double getSalarioMasComision()
    {
        return salarioBasico + super.getSalario();
    }

    @Override
    public String toString() {
        return "Empleado Comision mas\n" + super.toString() + "\nsalarioBasico= "+  salarioBasico + 
        "\nSalario Total= " + getSalarioMasComision();
    } 
    
    
        
    
}
