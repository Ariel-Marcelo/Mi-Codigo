/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

/**
 *
 * @author user
 */
public class NodoProvincia {
    Provincia provincia;
    NodoProvincia enlaceProvincia;
    NodoCanton nodoCanton;
    public NodoProvincia(Provincia provincia)
    {
        this.provincia = provincia;
        this.enlaceProvincia = null;
        this.nodoCanton = null;
    }
    public NodoProvincia(Provincia provincia, NodoProvincia nodoProvincia)
    {
        this.provincia = provincia;
        this.enlaceProvincia = nodoProvincia;
        this.nodoCanton = null;
    }
    public NodoProvincia(Provincia provincia, NodoProvincia nodoProvincia, NodoCanton nodoCanton)
    {
        this.provincia = provincia;
        this.enlaceProvincia = null;
        this.nodoCanton = null;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public NodoProvincia getEnlaceProvincia() {
        return enlaceProvincia;
    }

    public NodoCanton getNodoCanton() {
        return nodoCanton;
    }
    
    
}
