import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titles extends Actor
{
    public Titles(String text){
        GreenfootImage img = new GreenfootImage (text.length()*10, 60);
        img.setColor(Color.WHITE);
        img.drawString(text,2,50);
        
        setImage (img);
        
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight()*2;
         int myNewWidth = (int)myImage.getWidth()*2;
         myImage.scale(myNewWidth, myNewHeight);
    }
    
    /**
     * Act - do whatever the Titles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
