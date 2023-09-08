/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "universidadupl";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    public static Connection connetion;
    
    
    
    
    private conexion(){}
    
        
        
    public static Connection getconexion(){  
        
      if(connetion==null)  {
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            connetion  = DriverManager.getConnection(URL+DB+"?useLegacyDatetimeCode=false&serverTimezone=UTC"
                    +"&user="+USUARIO+"&password"+PASSWORD);
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"error al cargar driver"+ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro al conectar"+ex.getMessage());
        }
        
    
    
    
    
    
}
return connetion;
 }  


}