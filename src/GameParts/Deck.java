package GameParts;

import GameCore.TableElement;
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
    TableElement position;
    boolean visible;
    boolean sameSide; // Keeps all cards flipped correctly if true.
    
    // This always allows to know the full size of the deck,
    // even when in possible use.
    int size;
    
    public Deck()
    {
        cards = new LinkedList<>();
    }
    
    /**
     * Removes a card from the end of cards, and returns it.
     * <p>
     * Not to be confused with drawing graphics.
     * 
     * @return Card from the top of the deck.
     */
    public Card drawCard()
    {
        return cards.removeLast();
    }
    
    public Card getCardAt(int loc, boolean remove)
    {
        if (remove)
            return cards.remove(loc);
        
        return cards.get(loc);
    }
    
    public void addToTop(Card newCard)
    {
        // addLast, becase it's the same spot as
        // removeLast.
        cards.addLast(newCard);
    }
    
    public void addToBottom(Card newCard)
    {
        // addFirst because it's opposite to
        // removeLast.
        cards.addFirst(newCard);
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
