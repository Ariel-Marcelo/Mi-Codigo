
package Herencia;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class ManejadordeArchivos {
    File fe;
    File punteroAsalariado;//1
    File punteroHoras;//2
    File punteroHorasyComision;//3
    File punteroComision;//4
    
    BufferedReader entrada;
    BufferedWriter salida;
    BufferedWriter salida1;
    BufferedWriter salida2;
    BufferedWriter salida3;
    BufferedWriter salida4;
    ManejadordeArchivos() throws FileNotFoundException, IOException{
        fe = new File("C:\\Users\\user\\Desktop\\Empleados.txt");
        punteroAsalariado = new File("Salida Empleados.txt");
        punteroHoras = new File("Salida Empleados Horas.txt");
        punteroHorasyComision = new File("Salida Empleados por Horas Y Comisión.txt");
        punteroComision = new File("Salida Empleados comisión.txt");
        entrada = new BufferedReader(new FileReader(fe));
        salida = new BufferedWriter(new FileWriter(punteroAsalariado, true));
        salida2 = new BufferedWriter(new FileWriter(punteroHoras));
        salida3 = new BufferedWriter(new FileWriter(punteroHorasyComision));
        salida4 = new BufferedWriter(new FileWriter(punteroComision));
        
    }
    
    public void recolectarEmpleado()
    {
        String linea= "";
        try
        {
            while(entrada.ready())
            {
                linea = entrada.readLine();
                Pattern pat = Pattern.compile("^\\d+,(.+,)+");
                Matcher mat = pat.matcher(linea);
                if(mat.matches()){    
                    StringTokenizer tokens = new StringTokenizer(linea, ",");
                    switch(Integer.parseInt(tokens.nextToken()))
                    {
                        case 1:
                        
                            try{
                            
                                String nombre = tokens.nextToken();
                                Fecha fechaNacimiento = new Fecha(tokens.nextToken());
                                Fecha fechaIngreso = new Fecha(tokens.nextToken());
                                double salarioBasico = Double.parseDouble(tokens.nextToken());
                                EmpleadoAsalariado asalariado = new EmpleadoAsalariado(nombre, 
                                fechaNacimiento, fechaIngreso, salarioBasico);
                                salida.write(asalariado.toString());
                                salida.newLine();
                                
                          
                            
                            }catch(Exception e)
                            {
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
                            }
                           
                        
                       
                            break;
                            case 2:
                                
                                try{
                            
                                String nombre = tokens.nextToken();
                                Fecha fechaNacimiento2 = new Fecha(tokens.nextToken());
                                Fecha fechaIngreso2 = new Fecha(tokens.nextToken());
                                int numHoras = Integer.parseInt(tokens.nextToken());
                                double costoHoras = Double.parseDouble(tokens.nextToken());
                                EmpleadoPorHoras porhoras = new EmpleadoPorHoras(nombre, 
                                fechaNacimiento2,fechaIngreso2, numHoras,  costoHoras);
                                salida2.write(porhoras.toString());
                                salida2.newLine();
                                
                          
                            
                                }catch(Exception e)
                                {
                                    e.printStackTrace();
                                    JOptionPane.showMessageDialog(null, "Archivo no encontrado");
                                }
                        
                            break;
                            case 3:
                                
                                try{
                            
                                String nombre = tokens.nextToken();
                                Fecha fechaNacimiento2 = new Fecha(tokens.nextToken());
                                Fecha fechaIngreso2 = new Fecha(tokens.nextToken());
                                int numHoras = Integer.parseInt(tokens.nextToken());
                                double costoHoras = Double.parseDouble(tokens.nextToken());
                                EmpleadoPorHoras porhoras = new EmpleadoPorHoras(nombre, 
                                fechaNacimiento2,fechaIngreso2, numHoras,  costoHoras);
                                salida3.write(porhoras.toString());
                                salida3.newLine();
                                
                          
                            
                                }catch(Exception e)
                                {
                                    e.printStackTrace();
                                    JOptionPane.showMessageDialog(null, "Archivo no encontrado");
                                }
                        
                            break;
                            case 4:
                                
                                String nombre = tokens.nextToken();
                                Fecha fechaNacimiento2 = new Fecha(tokens.nextToken());
                                Fecha fechaIngreso2 = new Fecha(tokens.nextToken());
                                int numHoras = Integer.parseInt(tokens.nextToken());
                                double costoHoras = Double.parseDouble(tokens.nextToken());
                                EmpleadoPorHoras porhorasyComision = new EmpleadoPorHoras(nombre, 
                                fechaNacimiento2,fechaIngreso2, numHoras,  costoHoras);
                                salida3.write(porhorasyComision.toString());
                                salida3.newLine();
                                
                          
                            
                                }catch(Exception e)
                                {
                                    e.printStackTrace();
                                    JOptionPane.showMessageDialog(null, "Archivo no encontrado");
                                }
                        
                            break;
                            default:
                                break;
                                 
                    }
                
                    
               
                }
            }
            
            salida.close();
            salida2.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public String listar() 
    {
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(fe));
            while(bf.ready())
            {
                texto += bf.readLine();
                texto += "\n";
            }
        }catch(Exception e)
        {
            
        }
        return texto;
    }
    
}
