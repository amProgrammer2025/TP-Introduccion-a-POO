/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author gauta
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo(){
        
        System.out.println(this.getNombre() + ", " 
                + this.getApellido() + ", " 
                + this.getCurso() + ", "
                + this.getCalificacion());
        
    }
    
    public void subirCalificacion(double puntos){
        
        this.setCalificacion(this.getCalificacion() + puntos);
        
    }
    
    public void bajarCalificacion(double puntos){
        
        this.setCalificacion(this.getCalificacion() - puntos);
        
    }
    
}
