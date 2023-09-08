/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.entidades;

import java.time.LocalDate;

/**
 *
 * @author santi
 */
public class Alumno {
    
    private int idalumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechadenac;
    private boolean activo;
    
    
    public Alumno(){
    }

    public Alumno(int idalumno,int dni, String apellido, String nombre, LocalDate fechadenac, boolean activo) {
        this.idalumno = idalumno;
        this.dni= dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechadenac = fechadenac;
        this.activo = activo;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechadenac, boolean activo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechadenac = fechadenac;
        this.activo = activo;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechadenac() {
        return fechadenac;
    }

    public void setFechadenac(LocalDate fechadenac) {
        this.fechadenac = fechadenac;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    


    
    
    
    
    @Override
    public String toString() {
        return this.idalumno+" "+this.apellido+" "+this.nombre+" "+this.fechadenac+" "+this.activo; 
    }
    
    
    
    
    
}
