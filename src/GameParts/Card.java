package GameParts;

import java.awt.Image;

/**
 * Card is used in games that require
 * cards to play.
 * <p>
 * Card stores the state, graphics, and
 * other tasks it needs.
 * <p>
 * Card is usually in a deck, but doesn't
 * need to be.
 * 
 * @author Tyler
 */
public abstract class Card
{
    private boolean faceUp;
    private boolean visible;
    
    public Card()
    {
        // Use default image files.
        faceUp = false;
        visible = false;
    }
    
    public boolean isVisible()
    {
        return visible;
    }
    
    public boolean isFaceUp()
    {
        return faceUp;
    }
    
    public void flip()
    {
        faceUp = !faceUp;
    }
    
    // If there are special tasks that
    // need to be done upon action.
    public abstract void use();
    public abstract void discard();
    public abstract void drawCard(); // Not to be confused with drawing graphics.
    public abstract void display();
}
