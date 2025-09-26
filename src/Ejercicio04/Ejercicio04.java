/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

/**
 *
 * @author gauta
 */
public class Ejercicio04 {
 
    public static void main(String[] args){
        
        Gallina g1 = new Gallina(1, 0);
        Gallina g2 = new Gallina(2, 3);
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        g1.ponerHuevos(2);
        g1.ponerHuevos(3);
        g1.envejecer();
        g1.ponerHuevos(4);
        g1.ponerHuevos(7);
        g1.envejecer();
        
        g1.mostrarEstado();
        
        g2.ponerHuevos(4);
        g2.ponerHuevos(1);
        g2.envejecer();
        g2.ponerHuevos(5);
        g2.ponerHuevos(3);
        g2.envejecer();
        
        g2.mostrarEstado();
        
    }
    
}
