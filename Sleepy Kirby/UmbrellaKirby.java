import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UmbrellaKirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UmbrellaKirby extends Actor
{
    GifImage myGif = new GifImage("umbrellaKirby.gif");

    public UmbrellaKirby(){
        double scalePercent = 0.5;
        for (GreenfootImage image : myGif.getImages())
        {
            int wide = (int)(image.getWidth()*scalePercent);
            int high = (int)(image.getHeight()*scalePercent);
            image.scale(wide, high);
        }

    }

    /**
     * Act - do whatever the SleepingKirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    } 
}
