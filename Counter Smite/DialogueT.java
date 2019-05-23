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
        int dialogueNumber = 0;
        String dialogueHolder = "";
        PressF pressenter = new PressF();
        addObject(pressenter,360,360);
        if(isKeyDown("F")){
            dialogueHolder = "officerDialogue" + dialogueNumber;
            dialogueNumber++;
        }
            
        
        OfficerDialogue dialogueHolder = new OfficerDialogue(">Hello fellow terrorist.");
        addObject(officerdialogue,148,22);

        
    }
}
