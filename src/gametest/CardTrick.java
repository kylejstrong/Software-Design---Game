/*
 * Kyle Strong
 * 991632232
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Arrays;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
public class CardTrick {
    
    
    public static int userValue;
    public static String userSuit;
    //public boolean found = false;

    public static void main(String[] args)
    { 
        
   
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           
            c.setValue(1 + (int)(Math.random() * ((14 - 1) + 1)));
            c.setSuit(Card.SUITS[c.setSuit((Math.random() * ((3) + 1)))]);
        }
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a Card!");
        
        System.out.println("Enter Card Value (Ace = 1, Jack = 11, Queen = 12, King = 13): ");
        userValue = userInput.nextInt();
        
        System.out.println("Enter Card Suit (Hearts, Diamonds, Spades, Clubs): ");
        userSuit = userInput.nextLine();
        
        boolean found = false;
           for (int d = 0; d < magicHand.length; d++) {
            if (magicHand[d].equals(userSuit) && (magicHand[d].equals(userValue))) 
            {
            found = true;
            }
        
        if (found) {
            System.out.println("You Guessed Right!");
        } else {
            System.out.println("You Guessed Wrong!");
        }
        
    }
    
}
