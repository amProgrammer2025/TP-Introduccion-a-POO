
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

/**
 *
 * @author gauta
 */
public class Ejercicio05 {
    
    public static void main(String[] args){
        
        NaveEspacial ne1 = new NaveEspacial("NAVE 1", 50);
        
        ne1.mostrarEstado();
        
        ne1.despegar();
        ne1.avanzar(50);
        ne1.recargarCombustible(60);
        ne1.avanzar(50);
        
        ne1.mostrarEstado();
        
    }
    
}
