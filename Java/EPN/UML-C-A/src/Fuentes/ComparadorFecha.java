package Fuentes;
import java.util.Comparator;
public class ComparadorFecha implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Libro libro1,libro2;
        libro1 = (Libro)o1;
        libro2 = (Libro)o2;
        if(libro1.getFechaEdición().getAño() == libro2.getFechaEdición().getAño()){
            if(libro1.getFechaEdición().getMes() == libro2.getFechaEdición().getMes()){
                if(libro1.getFechaEdición().getDia() == libro2.getFechaEdición().getDia()){
                    return 0;
                }else{
                    if(libro1.getFechaEdición().getDia() > libro2.getFechaEdición().getDia()){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }else{
                if(libro1.getFechaEdición().getMes() > libro2.getFechaEdición().getMes()){
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            if(libro1.getFechaEdición().getAño() > libro2.getFechaEdición().getAño()){
                return 1;
            }else{
                return -1;
            }
        }
    }
}
