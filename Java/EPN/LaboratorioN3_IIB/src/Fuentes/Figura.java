package Fuentes;

import java.awt.Graphics;

/**
 * @author Ariel
 */

public abstract class Figura {
    
    public abstract void Dibujar(Graphics g);
    public abstract double getVolumen();
    public abstract double getPerimetro();
    public abstract double getArea();
}
