import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private double size = 0.1;
    public Enemy(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)(myImage.getHeight()*size);
        int myNewWidth = (int)(myImage.getWidth()*size);
        myImage.scale(myNewWidth, myNewHeight);
    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        follow();
        
        Actor UmbrellaKirby;
        UmbrellaKirby = getOneObjectAtOffset (0,0,UmbrellaKirby.class);
        if(UmbrellaKirby != null){
            World detect;
            detect = getWorld();
            detect.removeObject(UmbrellaKirby);
            
        }
    }    

    public void follow(){
        if (getWorld().getObjects(UmbrellaKirby.class).isEmpty()){
            return;
        } // skips following if the tank is not in world
        Actor character = (Actor)getWorld().getObjects(UmbrellaKirby.class).get(0); // gets reference to tank
        turnTowards(character.getX(), character.getY()); // turn toward tank
    }
}
