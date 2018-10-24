import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Espacio extends World {
    
    private GreenfootSound sonidoDeFondo;
    private int tiempoJuego;
    private int tiempoGeneracionAsteroides;
    
    private Nave nave;
    private Counter contador;
    private Boton botonRetry;
    //private ArrayList <Asteroide> asteroides;
    
    public Espacio() {    
        super(800, 600, 1, false); 
        
        // Configurar fondo negro
        GreenfootImage fondo = getBackground();
        fondo.setColor(Color.BLACK);
        fondo.fill();
        
        // Asignar el orden en que se pintan los objetos
        setPaintOrder(Boton.class, Counter.class, Nave.class, Asteroide.class, Estrella.class);
        
        /*Inicializar tiempoGeneracionAsteroides
        tiempoGeneracionAsteroides = 1000;
        asteroides = new Asteroide;
        for( Asteroide : asteroide = asteroides )
        {
            int y = -5;
            int x = Greenfoot.getRandomNumber(getWidth() - 5 + 1) - 5;
            addObject (asteroide.get(i), x, y);
        }
        */
        
        
        
        
    }
    
    
    
    
}
