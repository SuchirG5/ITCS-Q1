import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class BoxTopper extends Racer
{

   public BoxTopper(int y)
   {
      super(y);
   }
   
   public void jumpRight()
   {
      while (frontIsClear())
      {
         move();
         if (nextToABeeper())
         {
            return;
         }
      }
      turnLeft();
      while (!rightIsClear())
      {
         move();
      }
      turnRight();
      move();
      while(!rightIsClear())
      {
         move();
      }
      turnRight();
      while(frontIsClear())
      {
         move();
      }
      turnLeft();
   }



}