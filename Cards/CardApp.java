public class CardApp
{
    public static void main (String[] args){
        System.out.println("Game Start!");
        System.out.println("Player Profiles:");
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        //Creating players
        
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        Hand hand= new Hand();
        Card card = new Card();
        hand.addCard(card);
    }
}
