import java.awt.*;
/**
 * Write a description of class DStaff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DStaff
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Graphics g;
    /**
     * Constructor for objects of class DStaff
     */
    public DStaff(int y, int x, int size, Graphics g)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.g = g;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void stem()
    {
        // put your code here
        g.drawRect(2,2,2,2);
    }
}
