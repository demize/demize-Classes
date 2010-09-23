package demize;

/**
 * @author demize95
 * @version 0.1
 */

import java.awt.*;
import hsa.Console;

/**
 * Makes the repeated drawing of sprites on hsa.Console applications easier.
 */
public class Sprite
{   
    

	/**
	 * The color of the object
	 */
    Color color;
    /**
     * The x positions
     */
    public int[] xpos;
    /**
     * The y positions
     */
    public int[] ypos;
    /**
     * The type of Sprite to draw
     */
    int type;
    /**
     * The numbers of vertices of the sprite, if applicable
     */
    int vert;
    /**
     * The width of the sprite, if applicable    		
     */
    int width; 
    /**
     * The height of the sprite, if applicable
     */
    int height;
    /**
     * The hsa.Console to draw on
     */
    static Console c;

    /**
	 * Creates a polygon without drawing it.
	 * @param cn	The hsa.Console console to use
	 * @param cl 	The color to draw the object as
	 * @param xp	An array of x positions
	 * @param yp	An array of y positions
	 * @param vt	The amount of vertices used to draw the polygon
	 */
    public Sprite(Console cn, Color cl, int[] xp, int[] yp, int vt)
    {
    	
	color = cl;
	xpos = xp;
	ypos = yp;
	type = 1;
	vert = vt;
	c = cn;
	width = 0;
	height = 0;
    }
    
    /**
	 * Creates a rectangular object without drawing it
	 * @param cn	The hsa.Console to use
	 * @param cl	The color to draw the object as
	 * @param xp	The x position of the object
	 * @param yp	The y position of the object
	 * @param w 	The width of the object
	 * @param h 	The height of the object
	 * @param tp	the type of the object - 0 for rectangle, 2 for ellipse.
	 */
    public Sprite(Console cn, Color cl, int xp, int yp, int w, int h, int tp)
    {
    	
	xpos = new int[1];
	ypos = new int[1];
	color = cl;
	xpos[0] = xp;
	ypos[0] = yp;
	type = tp;
	vert = 0;
	c = cn;
	width = w;
	height = h;
    }
    
	/**
	 * Draws the sprite to the screen. Note that it doesn't do any checks beforehand so if you draw over something, said something will be overwritten.
	 * @return void
	 */
    public void draw() // Draw the sprite
    {
	c.setColor(color); // Use the set color
	if(type == 0) // Rectangle
	{
	    c.fillRect(xpos[0], ypos[0], width, height);
	}
	else if(type == 1) // Polygon
	{
	    c.fillPolygon(xpos, ypos, vert);
	}
	else if(type == 2) // Ellipse
	{
	    c.fillOval(xpos[0], ypos[0], width, height);
	}
    }

} // Sprite class
