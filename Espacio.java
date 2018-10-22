import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Espacio extends World {
    
    private GreenfootSound sonidoDeFondo;
    private int tiempoJuego;
    private int tiempoGeneracionAsteroides;
    
    private Nave nave;
    private Counter contador;
    private Boton botonRetry;
    
    public Espacio() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
}
