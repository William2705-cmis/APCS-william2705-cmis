import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressEnter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressF extends Actor
{
    public PressF(){
        GreenfootImage img = new GreenfootImage (300, 60);
        img.setColor(Color.WHITE);
        img.drawString(">Press (F) to continue<",2,50);
       
        setImage (img);
        
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight();
         int myNewWidth = (int)myImage.getWidth();
         myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the PressEnter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
    }    
}
