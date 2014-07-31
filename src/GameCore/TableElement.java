package GameCore;


import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
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
