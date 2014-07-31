package GameCore;

import java.awt.Graphics2D;

/**
 * Allows specific event handling for
 * different states in the game.
 * 
 * @author Tyler
 */
public interface Screen
{
    void update();
    void render(Graphics2D gr);
    Screen getNextScreen();
}
