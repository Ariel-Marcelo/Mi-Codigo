package Fuentes;

import java.util.logging.Logger;

public class Provincia {
    private String nombreProvincia;
    private int numeroProvincia;
    private int numHabitanteProvincia;

    public Provincia(String nombreProvincia, int numeroProvincia, int numHabitanteProvincia) {
        this.nombreProvincia = nombreProvincia;
        this.numeroProvincia = numeroProvincia;
        this.numHabitanteProvincia = numHabitanteProvincia;
    }
    

    public void setProvincia(String nombreProvincia, int numeroProvincia, int numHabitanteProvincia)
    {
        this.nombreProvincia = nombreProvincia;
        this.numeroProvincia = numeroProvincia;
        this.numHabitanteProvincia = numHabitanteProvincia;
    }    
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroProvincia() {
        return numeroProvincia;
    }

    public void setNumeroProvincia(int numeroProvincia) {
        this.numeroProvincia = numeroProvincia;
    }

    public int getNumHabitanteProvincia() {
        return numHabitanteProvincia;
    }

    public void setNumHabitanteProvincia(int numHabitanteProvincia) {
        this.numHabitanteProvincia = numHabitanteProvincia;
    }

    @Override
    public String toString() {
        return "Provincia\n" + "nombreProvincia=" + nombreProvincia 
                + "\nnumeroProvincia=" + numeroProvincia + 
                "\nnumHabitanteProvincia=" + numHabitanteProvincia;
    }
    
    
}
