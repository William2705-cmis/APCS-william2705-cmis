import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UmbrellaKirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UmbrellaKirby extends Actor
{
    GifImage myGif = new GifImage("umbrellaKirby.gif");

    public UmbrellaKirby(){
        double scalePercent = 0.3;
        for (GreenfootImage image : myGif.getImages())
        {
            int wide = (int)(image.getWidth()*scalePercent);
            int high = (int)(image.getHeight()*scalePercent);
            image.scale(wide, high);
        }

    }

    /**
     * Act - do whatever the SleepingKirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(myGif.getCurrentImage());
        move();

        Actor FallingStar;
        FallingStar = getOneObjectAtOffset (5,5,FallingStar.class);
        if(FallingStar != null){
            World detect;
            detect = getWorld();
            detect.removeObject(FallingStar);
        }
        if ("enter".equals(Greenfoot.getKey())){
            poop();
        }

    } 

    public void move(){
        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("W")) y-= 5;
        if(Greenfoot.isKeyDown("A")) x-= 5;
        if(Greenfoot.isKeyDown("D")) x+= 5;
        if(Greenfoot.isKeyDown("S")) y+= 5;
        setLocation(x,y);
    }

    private void poop(){
        Poop fire = new Poop();
        getWorld().addObject(fire,getX(),getY());  
        if (getImage().equals(left1) || getImage().equals(left2) || getImage().equals(left3) || getImage().equals(left4)) {
            fire.setRotation(180);
        }
        else if (getImage().equals(back1) || getImage().equals(back2) || getImage().equals(back3) || getImage().equals(back4)) {
            fire.setRotation(270);
        }
        else if (getImage().equals(front1) || getImage().equals(front2) || getImage().equals(front3) || getImage().equals(front4)) {
            fire.setRotation(90);
        }
        else if (getImage().equals(right1) || getImage().equals(right2) || getImage().equals(right3) || getImage().equals(right4)) {
            fire.setRotation(0);
        }        
        if(Greenfoot.isKeyDown("d") && (Greenfoot.isKeyDown("w"))){
            fire.setRotation(-45);
        }
        else if(Greenfoot.isKeyDown("w") && (Greenfoot.isKeyDown("a"))){
            fire.setRotation(-135);
        }
        else if(Greenfoot.isKeyDown("s") && (Greenfoot.isKeyDown("d"))){
            fire.setRotation(45);
        }
        else if(Greenfoot.isKeyDown("a") && (Greenfoot.isKeyDown("s"))){
            fire.setRotation(135);
        }

    }
}
