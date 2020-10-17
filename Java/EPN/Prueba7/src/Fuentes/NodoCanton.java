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
public class NodoCanton {
    Canton datoCanton; 
    NodoCanton enlaceCanton;
    
    public NodoCanton(Canton canton)
    {
        this.datoCanton = canton;
        this.enlaceCanton = null;
        
    }
    public NodoCanton(Canton canton, NodoCanton nodoCanton)
    {
        this.datoCanton = canton;
        this.enlaceCanton = nodoCanton;
    }
    public Canton getCanton()
    {
        return datoCanton;
    }
    
}
