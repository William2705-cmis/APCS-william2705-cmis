import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    public Car() 
    {
        velocity = 0;
    }
    public void act() 
    {
        fall();
        if (Greenfoot.isKeyDown("space") && (getY() > getWorld().getHeight() - 20)) jump();
    }    
    public void fall() 
    {
        setLocation(getX(), getY()+ velocity);
        if (getY() > getWorld().getHeight() - 20) velocity = 0;
        else velocity += GRAVITY;
    }
    public void jump(){
        velocity = -20;
    }
}

