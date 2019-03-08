public class CardApp
{
    public static void main (String[] args){
        Card[] deck = new Card[52];
        int d = 0;
        for(int rank = 0; rank < 13; rank++){
            for(int suit = 0; suit < 4; suit++){
                deck[d] = new Card(suit, rank);
                d++;
            }
        }
    }
    
}
