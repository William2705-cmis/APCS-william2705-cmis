import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OfficerDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OfficerDialogue extends Actor
{
    private void info(){
        if(mouseclick() == 1){
            OfficerDialogue officerDialogue = new OfficerDialogue(">Hello fellow terrorist.");;
        }
    }
    private int mouseclick(){
        int x = 0;
        if(Greenfoot.mouseClicked(this)){
            x++;
        }
        return x;
    }
    public void act() 
    {
        
    }    
    

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
}
