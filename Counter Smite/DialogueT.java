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
    public DialogueT()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Next pressf = new Next();
        addObject(pressf,427,358);

        OfficerDialogue officerDialogue = new OfficerDialogue(">Hello fellow terrorist.");
        addObject(officerDialogue,148,22);

        OfficerDialogue officerdialogue = new OfficerDialogue("What? Who are you?<");
        addObject(officerdialogue,531,62);

        
    }
}
