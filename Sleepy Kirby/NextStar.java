import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextStar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextStar extends SleepingKirbyBubble
{
    private int dia = 1;
   
    public NextStar(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/12;
        int myNewWidth = (int)myImage.getWidth()/12;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the NextStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&(dia==1)){
            Greenfoot.setWorld(new gamestart());
            dia++;
        }
        else if(Greenfoot.mouseClicked(this)&&(dia==2)){
            
            dia++;
        }
    }    
    
}
