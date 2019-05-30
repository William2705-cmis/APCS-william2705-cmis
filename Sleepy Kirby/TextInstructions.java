import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextInstructions extends Actor
{
    public TextInstructions(String text){
        GreenfootImage img = new GreenfootImage (text.length()*10, 60);
        img.setColor(Color.WHITE);
        img.drawString(text,2,50);
        
        setImage (img);
        
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight();
         int myNewWidth = (int)myImage.getWidth();
         myImage.scale(myNewWidth*1, myNewHeight*1);
    }
    /**
     * Act - do whatever the TextInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
