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
    }    
    public void fall() 
    {
        setLocation(getX(), getY()+ velocity);
    }
}

a