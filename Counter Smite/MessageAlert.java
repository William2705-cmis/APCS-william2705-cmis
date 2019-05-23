import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MessageAlert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessageAlert extends Actor
{
    public MessageAlert(){
        GreenfootImage img = new GreenfootImage (600, 400);
        img.setColor(Color.WHITE);
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight()/3;
         int myNewWidth = (int)myImage.getWidth()/3;
         myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the MessageAlert wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new DialogueT());
        }
    }    
    
}
