/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probaralunmos1;

import accesodatos.AlumnoData;
import java.time.LocalDate;
import java.time.Month;
import universidad.entidades.Alumno;

/**
 *
 * @author santi
 */
public class pruevaalumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        Alumno juan = new Alumno(45223654,"lopes","maria",LocalDate.of(2023, Month.MARCH, 22),true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juan);
        
        
        
        
        
        
    }
    
}
