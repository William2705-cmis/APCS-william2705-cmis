public class CardApp
{
    public static void main (String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        //Creating players
        
        Hand hand= new Hand();
        Card card = new Card();
        hand.addCard(card);
    }
}
