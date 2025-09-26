/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author gauta
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        
        System.out.println(this.getNombre() + ", " 
                + this.getEspecie() + ", " 
                + this.getEdad());
        
    }
    
    public void cumplirAnios(){
        
        System.out.println(this.getNombre() + " cumplio anios!");
        this.setEdad(this.getEdad() + 1);
        
    }
    
}
