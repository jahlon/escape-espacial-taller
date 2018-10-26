import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Espacio extends World {
    
    private GreenfootSound sonidoDeFondo;
    private int tiempoJuego;
    private int tiempoGeneracionAsteroides;
    private SimpleTimer timerJuego;
    
    private Nave nave;
    private Counter contador;
    private Boton botonRetry;
    
    public Espacio() {    
        super(800, 600, 1, false); 
        
        // Configurar fondo negro
        GreenfootImage fondo = getBackground();
        fondo.setColor(Color.BLACK);
        fondo.fill();
        
        // inicializar timer
        timerJuego = new SimpleTimer();
        
        // inicializar sonido de fondo
        sonidoDeFondo = new GreenfootSound("cruising.mp3");
        
        contador = new Counter("Tiempo: ");
        addObject(contador, 70, 20);
        
        inicializarNave();
        
        // Asignar el orden en que se pintan los objetos
        setPaintOrder(Boton.class, Counter.class, Nave.class, Asteroide.class, Estrella.class);
    }
    
    private void inicializarNave() {
        nave = new Nave();
        int x = getWidth()/2;
        int y = getHeight() - nave.getImage().getHeight()/2;
        addObject(nave, x, y);
    }
    
    public void reproducirSonido() {
        if( !sonidoDeFondo.isPlaying() ) {
           sonidoDeFondo.playLoop();
        }
    }
    
    private void contarTiempo() {
        if( timerJuego.millisElapsed() >= 1000 ) {
            timerJuego.mark();
            tiempoJuego++;
            contador.setValue(tiempoJuego);
        }
    }
    
    private void generarEstrella() {
        Estrella estrella = new Estrella();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = -5;
        addObject(estrella, x, y);
    }
    
    public void act() {
        contarTiempo();
        generarEstrella();
        reproducirSonido();
    }
}
