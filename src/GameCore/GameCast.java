package GameCore;

import GameParts.Player;
import java.util.LinkedList;

/**
 * 
 * @author Tyler
 */
public abstract class GameCast
{
    private LinkedList<Player> players;
    private Table table;
    private int playerLimit;
    
    public GameCast()
    {
        // init game.
    }
    
    public abstract void update();
    public abstract boolean isWinner();
    public abstract void render();
}
