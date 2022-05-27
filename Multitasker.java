import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Multitasker extends Athlete {


   //default constructor
    public Multitasker() 
    {
      super(1, 1, Display.NORTH, Display.INFINITY);
    }
   
   
   // 4 parameter constructor
    public Multitasker(int x, int y, int direction, int beepers)
    {
      super(x, y, direction, beepers);
    }
    
    //method to move and drop a beeper
    public void moveAndDrop()
    {
      move();
      putBeeper();
    }
    
    //method to drop a beeper and move
    public void dropAndMove()
    {
      putBeeper();
      move();
    }










}