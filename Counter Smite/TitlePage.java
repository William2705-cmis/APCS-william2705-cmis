import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends World
{

    /**
     * Constructor for objects of class TitlePage.
     * 
     */
    public TitlePage()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        PlayButton playbutton = new PlayButton();
        addObject(playbutton,300,200);

        
        Titles titles = new Titles("Counter Smite");
        addObject(titles,340,50);
        
        
    }
}
