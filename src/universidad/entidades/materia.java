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
public class materia {
    
    private int IDmateria;
    private String nombre;
    private int aniomateria;
    private boolean activo;

    public materia() {
    }

    public materia(int IDmateria, String nombre, int aniomateria, boolean activo) {
        this.IDmateria = IDmateria;
        this.nombre = nombre;
        this.aniomateria = aniomateria;
        this.activo = activo;
    }

    public materia(String nombre, int aniomateria, boolean activo) {
        this.nombre = nombre;
        this.aniomateria = aniomateria;
        this.activo = activo;
    }

    public int getIDmateria() {
        return IDmateria;
    }

    public void setIDmateria(int IDmateria) {
        this.IDmateria = IDmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniomateria() {
        return aniomateria;
    }

    public void setAniomateria(int aniomateria) {
        this.aniomateria = aniomateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return this.IDmateria+" "+this.nombre+" "+this.aniomateria+" "+this.activo;
    }
    
    
    
    
    
    
}
