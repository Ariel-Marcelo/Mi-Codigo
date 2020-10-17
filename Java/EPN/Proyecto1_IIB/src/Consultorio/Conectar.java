package Consultorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {
    private static Connection conn;
    private static final String driver = "org.gjt.mm.mysql.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost/miconsultorio_epn";

    public Conectar()
    {
        conn = null;
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"Conección exitosa");
            
        } catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"No se podido establecer una coneccion");
        }
    }
    
    public String getConection()
    {
        String salida = "";
        
            if(conn != null)
            {
                salida = "Conectado";
            }else{
                salida = "Desconectado";
            }
            
        return salida;
    }
    public void outConection()
    {
        conn = null;
    }
}