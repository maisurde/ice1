/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick 
{
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[8];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(generateRandomNumber());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
        }

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = kb.nextInt();
        System.out.print("Enter the suit of your card (0-3): ");
        int suitIndex = kb.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suitIndex]);

        boolean found = false;
        for (Card card : magicHand) 
        {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) 
            {
                found = true;
                break;
            }
        }

        if (found) 
        {
            System.out.println("Your card is in the magic hand!");
        } 
        
        else 
        {
            System.out.println("Your card is not in the magic hand.");
        }
    }

    private static int generateRandomNumber() 
    {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    private static int generateRandomNumber(int min, int max) 
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
        //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
