import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TerroristCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TerroristCharacter extends Actor
{
    public TerroristCharacter(){
         
    }
    /**
     * Act - do whatever the TerroristCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    private void click(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Lv1Dust2());
        }
    }
}
