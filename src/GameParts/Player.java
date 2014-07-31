package GameParts;

/**
 * Player is used to represent a participant
 * in a game.
 * 
 * @author Tyler
 */
public abstract class Player
{
    String name;
    
    public Player()
    {
        name = "<No name>";
    }
    
    public Player(String name)
    {
        this.name = name;
    }
}
