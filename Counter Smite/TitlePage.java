import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends MyWorld
{

    /**
     * Constructor for objects of class TitlePage.
     * 
     */
    public TitlePage()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playbutton = new PlayButton();
        addObject(playbutton,294,193);
        playbutton.setLocation(294,274);
    }
}