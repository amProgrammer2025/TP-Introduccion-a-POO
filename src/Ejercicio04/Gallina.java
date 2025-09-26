/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

/**
 *
 * @author gauta
 */
public class Gallina {
    
    private static int nextId = 1;
    private final int id;
    private int edad;
    private int huevosPuestos;

    public Gallina(int edad, int huevosPuestos){
        
        this.id = nextId++;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        
    }
    
    public int getId(){
        return id;
    }
    
    public int getEdad(){
        return edad;
    }
    
    private void setEdad(int edad){
        
        this.edad = edad;
        
    }
    
    public int getHuevosPuestos(){
        return huevosPuestos;
    }
    
    private void setHuevosPuestos(int huevosPuestos){
        
        this.huevosPuestos = huevosPuestos;
        
    }
    
    public void mostrarEstado(){
        
        System.out.println(this.getId() + ", " 
            + this.getEdad() + ", "
            + this.getHuevosPuestos());
        
    }
    
    public void ponerHuevos(int huevosPuestos){
        
        this.setHuevosPuestos(this.getHuevosPuestos() + huevosPuestos);
        
    }
    
    /**
     * Este metodo aumenta el valor de edad en uno
     * Permite envejecer a la gallina un año
     */
    
    public void envejecer(){
        
        this.setEdad(this.getEdad() + 1);
        
    }
    
}
