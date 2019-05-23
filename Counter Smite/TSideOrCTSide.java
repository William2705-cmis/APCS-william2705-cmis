import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TSideOrCTSide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TSideOrCTSide extends World
{

    /**
     * Constructor for objects of class TSideOrCTSide.
     * 
     */
    public TSideOrCTSide()
    {
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        TerroristCharacter terroristcharacter = new TerroristCharacter();
        addObject(terroristcharacter,480,200);

        CounterTerroristCharacter counterterroristcharacter = new CounterTerroristCharacter();
        addObject(counterterroristcharacter,150,200);

        Titles titles = new Titles("Choose a side");
        addObject(titles,360,50);

    }
}
