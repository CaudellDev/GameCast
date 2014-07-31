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
public class TableElement
{
    // Square defining spot on the image in Board, in pixels.
    private Point topLeft;
    private Point botRight;

    // Max amount of items that can enter.
    private int itemLimit;

    private int enterCount;
    private int passCount; 
    private int leaveCount;

    public void enterElement()
    {

    }

    public void leaveElement()
    {

    }
    
    public void passElement()
    {
        
    }
}
