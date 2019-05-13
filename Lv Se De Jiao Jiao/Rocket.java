import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move(){
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("W")) y-= 10;
        if(Greenfoot.isKeyDown("A")) x-= 10;
        if(Greenfoot.isKeyDown("D")) x+= 10;
        if(Greenfoot.isKeyDown("S")) y+= 10;
        setLocation(x,y);
    }
}
