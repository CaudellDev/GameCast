package GameParts;

import java.util.LinkedList;

/**
 * Deck is basically an array of Cards,
 * with some basic deck functions put in
 * like shuffle, or draw.
 * 
 * @author Tyler
 */
public abstract class Deck
{
    LinkedList<Card> cards;
    boolean visible;
    
    // Cards msy be in players hands.
    // This always allows to know the full size of the deck.
    int size;
    
    public Deck()
    {
        cards = new LinkedList<>();
    }
    
    public void shuffle()
    {
        // Create temporary array.
        // More efficient element accessing than
        // LinkedLists<>.
        Card[] tempArray = new Card[cards.size()];
        tempArray = cards.toArray(tempArray);
        cards.remove();
        
        // Fiscer-Yates shuffle algorithm.
        for (int i = cards.size() - 1; i > 0; i--)
        {
            // Adding .5 effecivelly rounds the random number.
            int randIndex = (int)(Math.random() * i + .5);
            
            Card tempCard = tempArray[i];
            tempArray[i] = tempArray[randIndex];
            tempArray[randIndex] = tempCard;
        }
        
        // Put temporary array back into LinkedList.
        for (int i = 0; i < cards.size(); i++)
        {
            cards.add(tempArray[i]);
        }
    }
}
