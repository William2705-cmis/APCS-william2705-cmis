import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextStartingPage extends Actor
{
    private String[] strings = new String[]{"Stop it! You're gonna wake it up!", "Shhhhhh!", "Stop it!", "(&^!@%*!@%)(!@&*"};
   
    public TextStartingPage(String text){
        GreenfootImage img = strings[NextStar.getDia]
        img.setColor(Color.WHITE);
        img.drawString(text,2,50);
        
        setImage (img);
        
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight();
         int myNewWidth = (int)myImage.getWidth();
         myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
