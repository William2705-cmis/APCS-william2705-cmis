import java.util.*;
public class Hand
{
    private List<Card> cards;
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void addCard (Card card){
        cards.add(card);
    }
    
    public int getValue(){
        return 0;
    }
}
