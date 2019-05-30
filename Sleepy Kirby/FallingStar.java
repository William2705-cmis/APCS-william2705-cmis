import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingStar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingStar extends Actor
{
    GifImage myGif = new GifImage("StarCount.gif");

    public FallingStar(){
        double scalePercent = 0.1;
        for (GreenfootImage image : myGif.getImages())
        {
            int wide = (int)(image.getWidth()*scalePercent);
            int high = (int)(image.getHeight()*scalePercent);
            image.scale(wide, high);
        }

    }

    /**
     * Act - do whatever the FallingStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        

        setImage(myGif.getCurrentImage());

        move();

    }    

    public void move(){
        int x = getX();
        int y = getY();
        y+= 1;
        setLocation(x,y);
    }

    
}
