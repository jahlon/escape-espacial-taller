import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
public class Espacio extends World {
    
    private GreenfootSound sonidoDeFondo;
    private int tiempoJuego;
    private int tiempoGeneracionAsteroides;
    private SimpleTimer tiempo;
    
    private Nave nave;
    private Counter contador;
    private Boton botonRetry;
    
    private Asteroide asteroide;
    
    private int cantidadInicialAsteroides;
    
    public Espacio() {    
        super(800, 600, 1, false); 
        
        // Configurar fondo negro
        GreenfootImage fondo = getBackground();
        fondo.setColor(Color.BLACK);
        fondo.fill();
        
        // Asignar el orden en que se pintan los objetos
        setPaintOrder(Boton.class, Counter.class, Nave.class, Asteroide.class, Estrella.class);
        
        //Inicializar tiempoGeneracionAsteroides
        tiempo = new SimpleTimer();       
        tiempoGeneracionAsteroides = 1000;
      
        cantidadInicialAsteroides = 1;
        tiempo.mark();   
    }
    
    public void generarAsteroide()
    {          
        if(tiempo.millisElapsed() >= tiempoGeneracionAsteroides)
          {            
            tiempo.mark();            
            int y = -5;
            int x = Greenfoot.getRandomNumber(getWidth() - 5 + 1) - 5;
            asteroide = new Asteroide();
            addObject (asteroide, x, y);
            int posicionX = nave.getX();
            int posicionY = nave.getY();
            asteroide.turnTowards(posicionX, posicionY);
          }
    }
    
    public void act()
    {
        generarAsteroide();
    }  
    
    
}
