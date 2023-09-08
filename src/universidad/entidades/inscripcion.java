/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.entidades;

/**
 *
 * @author santi
 */
public class inscripcion {
    
    private int IDinscripcion;
    private Alumno Alumno;
    private materia materia;
    private double nota;

    public inscripcion(int IDinscripcion, Alumno Alumno, materia materia, double nota) {
        this.IDinscripcion = IDinscripcion;
        this.Alumno = Alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public inscripcion(Alumno Alumno, materia materia, double nota) {
        this.Alumno = Alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public inscripcion() {
    }

    public inscripcion(double nota) {
        this.nota = nota;
    }

    public int getIDinscripcion() {
        return IDinscripcion;
    }

    public void setIDinscripcion(int IDinscripcion) {
        this.IDinscripcion = IDinscripcion;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public materia getMateria() {
        return materia;
    }

    public void setMateria(materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
     
    
    
    
            
            
}
