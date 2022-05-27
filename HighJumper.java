import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class HighJumper extends Racer
{

   public HighJumper(int y)
   {
      super(y);
   }
   
   public void jumpRight()
   {
      while (frontIsClear())
      {
         move();
         if(nextToABeeper())
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
      turnRight();
      while(frontIsClear())
      {
         move();
      }
      turnLeft();
   }



}