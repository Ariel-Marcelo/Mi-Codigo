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
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Iterator;
import java.util.StringTokenizer;

public class ManejoStringsPrueba {
    
    private String entrada;
    private ArrayList <String> lista;
    
    public ManejoStringsPrueba()
    {
        lista = new ArrayList<String>();
    }
    public void setString(String stringEntrada)
    {
        entrada = stringEntrada;
    }
    public ArrayList tokenizarString()
    {
        StringTokenizer tokens = new StringTokenizer(this.entrada, ",");
        
        for(int i = 0; tokens.hasMoreTokens(); i++)
        {
                lista.add(tokens.nextToken());
        }
        return lista;
    }
    public void convertirMayusculaPrimeraLetra()
    {
        ArrayList <String>listaAux = new ArrayList<String>();
        char[]caracteres;
        for(String aux: lista)
        {
            
            caracteres= aux.toCharArray();
            caracteres[0]=Character.toUpperCase(caracteres[0]);
            int indiceBlanco=aux.indexOf(' ');
            caracteres[indiceBlanco + 1]=Character.toUpperCase(caracteres[indiceBlanco + 1]);
            listaAux.add(String.copyValueOf(caracteres));
        }
        
        lista=listaAux;
        return;
    }
    
    public void ordenarStrings()
    {
       
        Collections.sort(lista);
    }

    @Override
    public String toString() {
        String salida = "";
        for(String aux: lista)
        {
            salida+= aux + " ";
        }
        return salida;
    }
    
    
    
}
