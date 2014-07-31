package GameCore;

import java.awt.Point;

/**
 * Allocates a specific area of something to tasks.
 * <p>
 * Those tasks could be:
 * <ul>
 * <li> Store a location.
 * <li> Store the position of something.
 * <li> Activate a method.
 * </ul>
 * 
 * @author Tyler
 */
public abstract class TableElement
{
    // Square defining spot on the image in Board, in pixels.
    private Point topLeft;
    private Point botRight;

    // Max amount of items that can enter.
    private int itemLimit;

    private int enterCount;
    private int passCount; 
    private int leaveCount;
    
    public TableElement()
    {
        
    }
    
    public TableElement(Point topLeft, Point botRight)
    {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }
    
    public Point getTopLeft()
    {
        return topLeft;
    }
    
    public Point getBotRight()
    {
        return botRight;
    }
    
    public Point getTopRight()
    {
        return new Point(topLeft.x, botRight.y);
    }
    
    public Point getBotLeft()
    {
        return new Point(botRight.x, topLeft.y);
    }
    
    public abstract void enterElement();
    public abstract void leaveElement();
    public abstract void passElement();
}
