import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarCount extends Actor
{
    GifImage myGif = new GifImage("StarCount.gif");

    public StarCount(){
        double scalePercent = 0.1;
        for (GreenfootImage image : myGif.getImages())
        {
            int wide = (int)(image.getWidth()*scalePercent);
            int high = (int)(image.getHeight()*scalePercent);
            image.scale(wide, high);
        }

    }
    public void act() 
    {
        setImage(myGif.getCurrentImage());
    }    
}
