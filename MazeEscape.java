import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class MazeEscape
{
   public static void main(String[] args)
   {

      String[] choices = {"maze1", "maze2", "maze3", "maze4",};
      String filename = (String)JOptionPane.showInputDialog(null, "Choose a map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
      Display.openWorld("maps/" + filename + ".map");
      
      Athlete bob = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
      Display.setSpeed(10);
      
      while(!bob.nextToABeeper())
      {  
           moveIfClear(bob);       
         
      }
      




   }
   
   public static void moveIfClear(Athlete x)
   {
      if(x.frontIsClear())
      {
         x.move();
      }
      else if (!x.frontIsClear() && x.rightIsClear())
      {
         x.turnRight();
         x.move();
         
      }
      else if(!x.frontIsClear() && !x.rightIsClear() && x.leftIsClear())
      {
         x.turnLeft();
         x.move();
      }
      else if (!x.frontIsClear() && !x.rightIsClear() && !x.leftIsClear() && x.backIsClear())
      {
         x.turnAround();
         x.move();
      }
      if(x.frontIsClear() && x.backIsClear() && x.rightIsClear())
      {
         x.turnRight();
         x.move();
      }
      if (x.frontIsClear() && x.rightIsClear() && x.leftIsClear() && x.backIsClear())
      {
         x.turnLeft();
         x.move();
      }

   }




}