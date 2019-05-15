import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spaceBackground extends World
{

    /**
     * Constructor for objects of class spaceBackground.
     * 
     */
    public spaceBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,38,226);
        rocket.setLocation(61,292);
        Car car = new Car();
        addObject(car,36,597);
        car.setLocation(32,586);
        Car car2 = new Car();
        addObject(car2,39,441);
        removeObject(car2);
    }
}
