package Herencia;
public class EmpleadoPorComision extends Empleado {
    
    private double valorVendido;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, Fecha fechaNacimiento, 
           Fecha fechaIngreso, double valorVendido, double porcentajeComision){
        
        super(nombre, fechaNacimiento, fechaIngreso);
        this.valorVendido = valorVendido;
        this.porcentajeComision = porcentajeComision;
    }    

    @Override
    public double getSalario() {
        return (porcentajeComision*valorVendido)/100;
    }
    
    @Override
    public String toString() {
        return "Empleado Salario Base mas\n" + super.toString() + "\nvalorVendido= " + valorVendido + 
        "\nporcentajeComision= " + porcentajeComision + 
        "\nsalario por comision= "+ this.getSalario();
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
    
}
