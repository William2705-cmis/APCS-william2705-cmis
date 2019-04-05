
public class Bird extends Game
{
    boolean eatResult = true;
    public Bird(int a, int b, String c){
        
    }

    public int move(int a, int b){

    }

    public int fly(int a, int b){

    }

    public String eat(String item){
        if (item == super.worms){
            eatResult = true;
        }
        else if(item == super.seeds){
            eatResult = true;
        }
        else{
            eatResult = false;
        }
    }

    public String getGraphic(){

    }

    public String getColor(){
        
    }
}
