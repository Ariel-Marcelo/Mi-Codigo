package Fuentes;

import java.awt.Graphics;

public class Cilindro extends Circulo {
    private int altura;

    public Cilindro(int x, int y, int radio, int altura) {
        super(x, y, radio);
        this.altura = altura;
    }   

    @Override
    public void Dibujar(Graphics g) {
        g.drawLine(super.getX()+super.radio*2,super.getY()-(altura/2)+ (super.radio/2),
                super.getX()+super.radio*2,super.getY()+(altura/2)+(super.radio/2));
        g.drawLine(super.getX(),super.getY()-(altura/2)+(super.radio/2),
                super.getX(),super.getY()+(altura/2)+(super.radio/2));
        g.drawOval(super.getX(),super.getY()-(altura/2),
                super.radio*2,super.radio);
        g.drawOval(super.getX(),super.getY()+(altura/2),
                super.radio*2,super.radio);
        g.drawOval(super.getX(), super.getY(), 1, 1);
    }

    @Override
    public double getVolumen() {
        return super.getArea()*altura;
    }

    @Override
    public double getPerimetro() {
        return super.getPerimetro(); 
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Cilindro: "+ "altura= " + altura + "\n" + super.toString();
    }
}
