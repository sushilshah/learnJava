/*************************************************************************
 *  Compilation:  javac Deck.java
 *  Execution:    java Deck
 *
 *  Deal 52 cards uniformly at random.
 *
 *  % java Deck
 *  Ace of Clubs
 *  8 of Diamonds
 *  5 of Diamonds
 *  ...
 *  8 of Hearts
 *
 *************************************************************************/

public class Decktest {
    public static void main(String[] args) {
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // avoid hardwired constants
        int SUITS = suit.length;
        int RANKS = rank.length;
        int N = SUITS * RANKS;
		System.out.print(SUITS + "\t" + RANKS + "\t" + N);

/*		After creating the two arrays, we might use them to print out a random card name such as Queen of Clubs, as follows.
 
		int i = (int) (Math.random() * rank.length); 
		int j = (int) (Math.random() * suit.length); 
		System.out.println(rank[i] + " of " + suit[j]);  */

		
        // initialize deck
        String[] deck = new String[N];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < SUITS; j++) {
                deck[SUITS*i + j] = rank[i] + " of " + suit[j];
            }
        }

        // shuffle
        for (int i = 0; i < N; i++) {
            int r = i + (int) (Math.random() * (N-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }

        // print shuffled deck
        /* for (int i = 0; i < N; i++) {
            System.out.println(deck[i]);
        }*/
    }

}




