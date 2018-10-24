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
    }    
}
