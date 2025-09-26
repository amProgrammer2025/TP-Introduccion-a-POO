/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author gauta
 */
public class Ejercicio01 {
    
    public static void main(String[] args){
        
        Estudiante e1 = new Estudiante();
        
        e1.setNombre("Carlos");
        e1.setApellido("Castro");
        e1.setCurso("Programacion");
        e1.setCalificacion(7.2);
        
        e1.mostrarInfo();
        
        e1.subirCalificacion(2.4);
        
        e1.mostrarInfo();
        
        e1.bajarCalificacion(3.2);
        
        e1.mostrarInfo();
        
    }
    
}
