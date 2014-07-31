package GameParts;

/**
 * Dice is a Pseudo-random generator
 * that also handles graphics, among
 * other things.
 * 
 * @author Tyler
 */
public class Dice extends Random
{
    int sides;
    int incriment;
    int currSide;
    int visible;
    
    public Dice()
    {
        // Default to standart 6-sided die.
        sides = 6;
    }
    
    public Dice(int sides)
    {
        this.sides = sides;
    }
    
    public int roll()
    {
        // rand() * sides = side landed on.
        // * incriment = number on the side it landed on.
        // + .5 = Roundeds up the number.
        currSide = (int)(Math.random() * sides * incriment + .5);
        return currSide;
    }
    
    public void render()
    {
        
    }
}
