import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number extends StarCount
{
    private int number = 0;
    
    public Number(String text){
        GreenfootImage img = new GreenfootImage (text.length()*10, 60);
        img.setColor(Color.WHITE);
        img.drawString(text,2,50);
        
        setImage (img);
        
        GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight();
         int myNewWidth = (int)myImage.getWidth();
         myImage.scale(myNewWidth*2, myNewHeight*2);
    }
    /**
     * Act - do whatever the Number wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public void setNumber(){
        number++;
    }
    public int getNumber(){
        return number;
    }
}
