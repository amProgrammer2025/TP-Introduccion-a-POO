/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

/**
 *
 * @author gauta
 */
public class NaveEspacial {
    
    public static final double KM_POR_COMBUSTIBLE = 1.5;
    public static final double LIMITE_COMBUSTIBLE = 150;
    
    private String nombre;
    private double combustible;
    private boolean enMovimiento;
    
    public NaveEspacial(String nombre, double combustible){
        
        this.nombre = nombre;
        this.combustible = combustible;
        this.enMovimiento = false;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public boolean getEnMovimiento(){
        return enMovimiento;
    }
    
    /** 
     * Este metodo cambia el valor del atributo enMovimiento a 'true'
     * Para ello, primero verifica si la nave tiene combustible.
     * Pone en movimiento a la nave
     */
    
    public void despegar(){
        
        if(this.getCombustible() > 0){
            
            this.enMovimiento = true;
            
        }
        
    }
    
    /**
     * Este metodo cambia el valor del atributo enMovimiento a 'false'
     * Detiene la nave.
     */
    
    public void estacionar(){
        
        this.enMovimiento = false;
        
    }
    
    /**
     * Este metodo devuelve cuanto combustible va a consumir recorrer
     * cierta distancia
     * 
     * @param distancia se trata de la distancia que se pretende recorrer
     * @return 
     */
    
    public double calcularConsumoCombustible(double distancia){
        
        return distancia * KM_POR_COMBUSTIBLE;
        
    }
    
    /**
     * Este metodo hace que la nave avance
     * Primero verifique que la nave ya haya despegado y de si se tiene el
     * suficiente combustible para llevar a cabo el desplazamiento que se pretende
     * De lo contrario la nave no avanzará
     * 
     * @param distancia se trata de la distancia que se pretende recorrer
     */
    
    public void avanzar(double distancia){
        
        if(this.getEnMovimiento()){
            
            if(this.getCombustible() > this.calcularConsumoCombustible(distancia)){
            
                System.out.println("La nave avanza " + distancia);
            
            } else {
            
                System.out.println("No es posbile avanzar esa distancia con el nivel de combustible actual");
            
            }
            
        } else{
            
            System.out.println("La nave todavia no ha despegado");
            
        }
        
    }
    
    /**
     * Este metodo aumenta el valor del atributo combustible
     * Primero verifica que la cantidad de combustible que se pretende recargar
     * no exceda el limite de combustible de la nave
     * 
     * @param cantidad se trata de la cantidad de combustible que se pretende recargar
     */
    
    public void recargarCombustible(double cantidad){
        
        if(cantidad < LIMITE_COMBUSTIBLE){
            
            this.setCombustible(this.getCombustible() + cantidad);
            System.out.println("Cantidad de combustible actual: " + this.getCombustible());
            
        } else {
            
            System.out.println("Esa cantidad de combustible supera los limites de la nave");
            
        }
        
    }
    
    public void mostrarEstado(){
        
        System.out.println(this.getNombre() + ", " 
            + this.getCombustible() + ", "
            + this.getEnMovimiento());
        
    }
    
}
