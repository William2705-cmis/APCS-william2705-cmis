import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gamestart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gamestart extends World
{
    private int number = 0;
    public void act(){
        boolean addNumber = false;
        int max = 3;   
        int max2 = 5;
        int maxkirby = 1;
        int x = Greenfoot.getRandomNumber(1280);
        int y = Greenfoot.getRandomNumber(720);
        if (y < 720/2){
            y = 0;
        }if (y > 720/2){
            y = 720;
        }
        if (getObjects(UmbrellaKirby.class).size()<maxkirby && (maxkirby>-1))
        {
             addObject(new BigTitleEndGame("Game Over!"),1280/2,720/2); 
        }
        if (getObjects(Enemy.class).size()<max)
        {
            addObject(new Enemy(),x,y);    
        }
        if (getObjects(Enemy.class).size()<max-1){
            max++;
        }
        if (getObjects(FallingStar.class).size()<max2)
        {
            addObject(new FallingStar(),x,0);    
            setNumber();
            addNumber=true;
        }
        if (getObjects(FallingStar.class).size()<max2-1){
            max2++;

        }
        
        if(addNumber=true){
            showText(""+number,1205,30);
        }

    }

    /**
     * Constructor for objects of class gamestart.
     * 
     */
    public gamestart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();

    }
    
    public void prepare(){
        number = 0;
        UmbrellaKirby umbrellakirby = new UmbrellaKirby();
        addObject(umbrellakirby,(1280/2),(720/2));

        StarCount starcount = new StarCount();
        addObject(starcount,1250,30);

        TextInstructions textinstructions2 = new TextInstructions("Moving Keys: W, A, S, D");
        addObject(textinstructions2,631,223);

        TextInstructions textinstructions3 = new TextInstructions("Collect the stars!");
        addObject(textinstructions3,628,243);

        
        TextInstructions textinstructions = new TextInstructions("Press SPACE to shoot ;)");
        addObject(textinstructions,634,264);

        TextInstructions textinstructions4 = new TextInstructions("Because I'm nice you get 5 extra points :D");
        addObject(textinstructions4,1194,111);
        
    }

    public void setNumber(){
        number++;
        getNumber();
    }

    public int getNumber(){
        
        return number;
    }
}
