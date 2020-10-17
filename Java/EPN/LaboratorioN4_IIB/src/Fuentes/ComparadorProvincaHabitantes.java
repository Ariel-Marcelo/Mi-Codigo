
package Fuentes;

import java.util.Comparator;

public class ComparadorProvincaHabitantes implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Provincia provincia1,provincia2;
        provincia1 = (Provincia)o1;// tenemos 2 objetos y o1 los cambiamos a tipo
        provincia2 = (Provincia)o2;
        
        if(provincia1.getNumHabitanteProvincia()== provincia2.getNumHabitanteProvincia())
        {
             return 0;       
        }else{
            
            if(provincia1.getNumHabitanteProvincia()>provincia2.getNumHabitanteProvincia())
            {
                return 1;
            }else
            {
                return -1;
            }
        }
        
    }

    
    
}
