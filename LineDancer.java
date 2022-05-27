import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class LineDancer extends Dancer implements Runnable
{

   public LineDancer(int x, int y, int beepers)
   {
      super(x, y, Display.NORTH, beepers);
   }
   
   public void danceStep()
   {
      for(int i = 0; i < 5; i++)
      {
         move();
      }
      turnLeft();
      move();
      turnLeft();
   }
   
   
   
   
}