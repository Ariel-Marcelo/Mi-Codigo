package Fuentes;

import java.awt.Graphics;


public class  Punto extends Figura {
    private final int x,y;
    
    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Puntos: " + "x=" + x + ", y=" + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public void Dibujar(Graphics g) {
        g.drawOval(x, y, 1, 1);
    }

    @Override
    public double getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
