import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class AmogusDancer extends Dancer implements Runnable
{

   public AmogusDancer(int x, int y, int beepers)
   {
      super(x, y, Display.NORTH, beepers);
   }
   
   public void danceStep()
   {
      for(int i = 0; i < 5; i++)
      {
         move();
         putBeeper();
      }
      turnRight();
   }
   
   
   
   
}