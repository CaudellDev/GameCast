
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author Tyler
 */
public abstract class Board
{
    private Image board;
    
    public Board()
    {
        
    }
    
    public abstract class Spot
    {
        // Square defining spot on the image in Board, in pixels.
        private Point topLeft;
        private Point botRight;
        
        // Max amount of items that can enter.
        private int itemLimit;
        
        private int enterCount;
        private int leaveCount;
        
        public void enterSpot(Object item)
        {
            
        }
        
        public void leaveSpot()
        {
            
        }
    }
}
