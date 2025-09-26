/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

/**
 *
 * @author gauta
 */
public class Ejercicio03 {
    
    public static void main(String[] args){
        
        Libro l1 = new Libro();
        
        l1.setTitulo("Don Quijote de la Mancha");
        l1.setAutor("Miguel de Cervantes");
        l1.setAnioPublicacion(2027);
        
        // Al intentar establecer un año invalido como "anioPublicacion", 
        // Java le asignara el valor por defecto a ese atributo (0)
        
        l1.mostrarInfo();
        
        l1.setAnioPublicacion(1605);
        
        l1.mostrarInfo();
        
    }
    
}
