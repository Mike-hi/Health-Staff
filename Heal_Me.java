import java.util.Scanner;
import java.awt.*;
/**
 * Write a description of class Heal_Me here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heal_Me
{
    public static void main(String args[])
    {
        DrawingPanel panel = new DrawingPanel(1000, 1000);
        
        Graphics g = panel.getGraphics();
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("X: ");
        int x = scnr.nextInt();
        System.out.println("Y: ");
        int y = scnr.nextInt();
        System.out.println("Size: ");
        int size = scnr.nextInt();
        DStaff stf = new DStaff(x, y, size, g);
        stf.stem();
    }
}
