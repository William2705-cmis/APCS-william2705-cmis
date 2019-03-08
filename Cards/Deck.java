import java.util.*;
public class Deck
{
    private List<Card> cards;
    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        while(nDecks > 0){
            for(int suit = 0; suit < 4; suit++){
                for(int rank = 0; rank < 13; rank++){
                    cards.add(new Card (suit, rank));
                }
            }
            nDecks--;
        }
    }
    
    public int nCards(){
        return 0;
    }
    
    public Card draw(){
        int last = cards.size() - 1;
        return cards.remove (last);
        
    }
    
    public void shuffle(){
        //cards.get(cards, index);
        //cards.get(index);
    }
}