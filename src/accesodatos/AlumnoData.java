/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad.entidades.Alumno;

/**
 *
 * @author santi
 */
public class AlumnoData {
    
    
    //conectamos
    private Connection con = null;
    
    
    ///implementamos el constuctor
    

    public AlumnoData() {
        
        con= conexion.getconexion();
        
    }
    
    //metodos
    //importamos alumnos de entidades
    public void guardarAlumno(Alumno alumno){
        
        /// los ??? es donde van los alumnos
        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechadenacimiento,estado)"
                +"VALUES (?, ?, ?,? ,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechadenac())); //utilizo Date.valueOf para pasar un localdate a date
            ps.setBoolean(5, alumno.getActivo());
            ps.executeUpdate();
            
            ResultSet RS = ps.getGeneratedKeys(); // tabla de alumnos 
          
            if (RS.next()) { 
                alumno.setIdalumno(RS.getInt(1));
            
            ///recorrec con if por q es solo un alumno si son mas alumnos un while
                JOptionPane.showMessageDialog(null,"alumno guardado"); //mostrar si se guardo bien
            
            }
            ps.close();                  
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
        }
        
    }
    
    
    
    
    
    
}
