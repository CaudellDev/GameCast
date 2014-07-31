package GameParts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
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
