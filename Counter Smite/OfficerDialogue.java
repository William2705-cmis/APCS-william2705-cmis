import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OfficerDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OfficerDialogue extends Actor
{
    public OfficerDialogue(String text){
        GreenfootImage img = new GreenfootImage (text.length()*10, 60);
        img.setColor(Color.WHITE);
        img.drawString(text,2,50);
       
        setImage (img);
        
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight();
         int myNewWidth = (int)myImage.getWidth();
         myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
