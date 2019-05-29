import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DialogueT extends World
{

    /**
     * Constructor for objects of class Dialogue.
     * 
     */
    private Next next = new Next();
    public DialogueT()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();

    }
    public void act(){
        if(next.getDia()==1 && Greenfoot.mouseClicked(next)){
            OfficerDialogue officerdialogue = new OfficerDialogue("What? Who are you?<");
            addObject(officerdialogue,531,62);
        }
        
        else if(next.getDia()==2 && Greenfoot.mouseClicked(next)){
            OfficerDialogue officerdialogue = new OfficerDialogue(">I am Young Il, your terror commander.");
            addObject(officerdialogue,216,122);
        }
        else if(next.getDia()==3 && Greenfoot.mouseClicked(next)){
            OfficerDialogue officerdialogue = new OfficerDialogue("Terror commander?<");
            addObject(officerdialogue,531,162);
        }
        else if(next.getDia()==4 && Greenfoot.mouseClicked(next)){
            OfficerDialogue officerdialogue = new OfficerDialogue(">Yep, now you have a mission.");
            addObject(officerdialogue,170,222);
        }
        else if(next.getDia()==5 && Greenfoot.mouseClicked(next)){
            OfficerDialogue officerdialogue = new OfficerDialogue("Nani? A mission desuka? UwU<");
            addObject(officerdialogue,523,262);
        }
        else if(next.getDia()==6 && Greenfoot.mouseClicked(next)){
            OfficerDialogue officerdialogue = new OfficerDialogue("*Young Il dies from the power of the weeb cringeness*");
            addObject(officerdialogue,390,312);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(next,427,358);
        
        OfficerDialogue officerDialogue = new OfficerDialogue(">Hello fellow terrorist.");
        addObject(officerDialogue,148,22);
        
        

    }
}
