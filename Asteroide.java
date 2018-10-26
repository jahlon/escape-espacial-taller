 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Asteroide extends Actor {
    
    private int velocidad;
    
    public Asteroide()
    {    
        velocidad = Greenfoot.getRandomNumber(8 - 3 + 1) + 3;
    }       
    
    public void moverAsteroide()
    {
        setLocation (getX(), getY() + velocidad);
    }      
    
    public void act() {
        moverAsteroide();
        Asteroide asteroide = new Asteroide();
        World mundo = getWorld();
        int X = asteroide.getX();
        int Y = asteroide.getY();
        int alto = mundo.getHeight();
        int ancho = mundo.getWidth();
        if (Y == alto) 
        {            
            mundo.removeObject(this);   
        }
        
        if (X == ancho) 
        {            
            mundo.removeObject(this);   
        }
        
        if (X == 0) 
        {
            mundo.removeObject(this);
        }
    }    
}
