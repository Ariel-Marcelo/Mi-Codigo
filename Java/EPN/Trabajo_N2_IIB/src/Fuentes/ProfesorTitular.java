
package Fuentes;

public class ProfesorTitular extends Profesor {
    double salarioQuincena;
    double salarioFinMes;

    public ProfesorTitular(String nombre, Fecha fechaNacimiento, String titulo,
        Fecha fechaIngreso, double salarioQuincena, double salarioFinMes){
        super(nombre, fechaNacimiento, titulo, fechaIngreso);
        this.salarioFinMes = salarioFinMes;
        this.salarioQuincena = salarioQuincena;
    }
    @Override
    public double getSalario() {
         return salarioQuincena + salarioFinMes;
    }
    
     @Override
    public String toString() {
        return "Profesor Titular\n"+super.toString() + "\nSalario Quincena= " + salarioQuincena + 
      "\nSalario Fin de Mes= " + salarioFinMes + "\nSalario total= " + getSalario();
    }
}
