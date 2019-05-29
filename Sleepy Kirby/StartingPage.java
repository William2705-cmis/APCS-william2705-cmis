import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartingPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingPage extends World
{

    /**
     * Constructor for objects of class StartingPage.
     * 
     */
    public StartingPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SleepingKirby sleepingkirby = new SleepingKirby();
        addObject(sleepingkirby,566,562);

        SleepingKirbyBubble sleepingkirbybubble = new SleepingKirbyBubble();
        addObject(sleepingkirbybubble,415,486);
        ;
        TextStartingPage textstartingpage = new TextStartingPage("Kirby is sleeping...");
        addObject(textstartingpage,453,468);

    }
}
