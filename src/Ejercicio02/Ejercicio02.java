/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author gauta
 */
public class Ejercicio02 {
    
    public static void main(String[] args){
        
        Mascota m1 = new Mascota();
        
        m1.setNombre("Michi");
        m1.setEspecie("Gato");
        m1.setEdad(5);
        
        m1.mostrarInfo();
        
        m1.cumplirAnios();
        m1.cumplirAnios();
        m1.cumplirAnios();
        
        m1.mostrarInfo();
        
    }
    
}
