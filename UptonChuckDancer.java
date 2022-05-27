import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class UptonChuckDancer extends Dancer implements Runnable
{

   public UptonChuckDancer(int x, int y, int beepers)
   {
      super(x, y, Display.NORTH, beepers);
   }
   
   public void moveX(int x)
   {
      for(int i = 0; i<x; i++)
      {
         move();
      }
   }
   public void danceStep()
   {
      for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j < 7; j++)
         {
            moveX(j);
         }
         turnLeft();
         move();
         turnLeft();
      }
   }
   
   
   
   
}