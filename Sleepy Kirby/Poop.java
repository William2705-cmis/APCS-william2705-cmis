import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poop extends UmbrellaKirby
{
    public Poop(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/28;
        int myNewWidth = (int)myImage.getWidth()/28;
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the Poop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
