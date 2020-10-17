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

public class ListaEncadenadaProvincias {
    
    NodoProvincia inicioProvincia;
    public ListaEncadenadaProvincias()
    {
        inicioProvincia = null;
    }
    
    public void addInicioProvincia(Provincia provincia)
    {
        if(estaVaciaProvincia()){
            this.inicioProvincia = new  NodoProvincia(provincia);
           
        }else{
            this.inicioProvincia.enlaceProvincia = new NodoProvincia(provincia, inicioProvincia);
            
        }
    }
    
    public  Canton mayorNumHabitantesPorProvincia()
    {
        NodoProvincia aux = inicioProvincia;
        boolean bandera = false;
        int a = aux.getNodoCanton().getCanton().getNumHabitantes();
        while(aux.nodoCanton != null && bandera != true){
           
            aux.nodoCanton= inicioProvincia.nodoCanton.enlaceCanton;
            if(a < aux.getNodoCanton().getCanton().getNumHabitantes())
            {
                a = aux.getNodoCanton().getCanton().getNumHabitantes();
            }
            if(aux.nodoCanton.enlaceCanton == null)
            {
                bandera = true;
            }
              
        }
        return aux.nodoCanton.getCanton();
    }
    public boolean estaVaciaProvincia()
    {
        return inicioProvincia == null;
    }
    
     @Override
    public String toString() {
        String salida = "";
        if (estaVaciaProvincia())
        {
            return "Lista Vacia";
        }else{
            salida +=  "La LISTA Empleado es:";
            NodoProvincia p = inicioProvincia;
            while(p!= null){
                salida += "\n" + p.provincia;
                p = p.enlaceProvincia;
            }
            return salida;
        }
    }
    /*
    public ListaEncadenadaProvincias(Provincia provincia)
    {
        this.provincia.provincia = provincia;
        this.provincia.enlaceProvincia = null;
        this.provincia.nodoCanton = null;
        
    }
    public ListaEncadenadaProvincias(Provincia provincia,NodoProvincia nodoProvincia)
    {
        this.provincia.provincia = provincia;
        this.provincia.enlaceProvincia = nodoProvincia;
        this.provincia.nodoCanton = null;
        
    }
    public ListaEncadenadaProvincias(Provincia provincia, NodoProvincia enlaceProvincia, NodoCanton enlaceCanton)
    {
        this.provincia.provincia = provincia;
        this.provincia.enlaceProvincia = enlaceProvincia;
        this.provincia.nodoCanton = enlaceCanton;
    }
    */

   
}
