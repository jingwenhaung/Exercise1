package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Jingwen Huang May 23, 2023
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random1 = new Random();
            //card.setValue(insert call to random number generator here)
            card.setValue(random1.nextInt(13)+1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[random1.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        Scanner input = new Scanner(System.in);
        Card card1 = new Card();
        System.out.print("Enter Card value 1-13: ");
        card1.setValue(input.nextInt());
        System.out.print("Enter Card suit: ");
        card1.setSuit(input.nextLine());
        
        for(int i = 0; i < hand.length; i++){
            if(hand[i].getValue()== card1.getValue()&&hand[i].getSuit().equals(card1.getSuit())){
                printInfo();
            }
        }
        
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        //I'm done!
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Jingwen, but you can call me Missy");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Finish the Computer Programing");
        System.out.println("-- Find a job about coding!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Traveling");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Hiking");

        System.out.println();
        
    
    }

}
