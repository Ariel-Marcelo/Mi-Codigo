package Fuentes;

import java.awt.Graphics;
public class Circulo extends Punto{
    int radio;

    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }
/*
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio, 2);
    }
¨*/
    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void Dibujar(Graphics g) {
        g.drawOval(super.getX(),super.getY(),radio*2,radio*2);
    }

    @Override
    public String toString() {
        return "Circulo: " + " radio= " + radio+ "\n" + super.toString() ;
    }
    
}
