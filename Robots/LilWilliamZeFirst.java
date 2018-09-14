import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LilWilliamZeFirst extends Robot
{
    public LilWilliamZeFirst(){
        super(Color.CYAN);
    }
    
    public void init(){
        
    }
    
    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
    int executefront = 0;
    int executeback = 0;
    int executedown = 0;
    int executeup = 0;
    
        
        
        
    
        if((isClearLeft() && (isClearRight() == false && isClearUp() == false && isClearDown() == false)) && executeback == 0 && executedown == 0 && executefront == 0 && executeup == 0){
            left();
            left();
            left();
            left();
            left();
            left();
            up();
            right();
            down();
            executeback++;
        }
        if(isClearRight()){
            right();
            right();
            right();
            right();
            right();
            executefront++;
        }
        if((isClearDown() && (isClearUp() == false && isClearRight() == false)) && executeback == 0 && executefront == 0 && executeup == 0){
            down();
            down();
            down();
            down();
            down();
            
            executedown++;
        }
        if((isClearUp() && (isClearRight() == false)) && executeback == 0 && executedown == 0 && executefront == 0) {
            up();
            up();
            up();
            up();
            up();
            executeup++;
        }
        if((isClearDown() && (isClearUp() == false && isClearRight() == false)) && executeback == 0 && executedown == 0 && executefront == 0 && executeup == 0){
            down();
            down();
            down();
            down();
            down();
            
        }
        if((isClearUp() && (isClearRight() == false)) && executeback == 0 && executedown == 0 && executefront == 0 && executeup == 0) {
           up();
           up();
           up();
           up();
           up();
        }
        if((isClearLeft() && (isClearRight() == false && isClearUp() == false && isClearDown() == false)) && executedown == 0 && executefront == 0 && executeup == 0){
           left();
           left();
           left();
           left();
           left();
           executeback++;
        }
        
    }
}

