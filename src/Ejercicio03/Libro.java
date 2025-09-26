/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

/**
 *
 * @author gauta
 */

public class Libro {
    
    public static final int ANIO_ACTUAL = 2025;
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        
        if(anioPublicacion < ANIO_ACTUAL){
            
            this.anioPublicacion = anioPublicacion;
            
        }
        
    }
    
    public void mostrarInfo(){
        
        System.out.println(this.getTitulo() + ", " 
                + this.getAutor() + ", "
                + this.getAnioPublicacion());
        
    }
    
}
