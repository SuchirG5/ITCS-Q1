import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Climber2 extends Athlete2 {

   public Climber2() 
   {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   
   
   
   public Climber2(int x, int y, int direction, int beepers) 
   {
      super(x, y, direction, beepers);
   }
   
   public void climb(String x, String y, int z)
   {
      if (x == "Right")
      {
         if(y == "Up")
         {
            for (int j = 0; j < z; j++)
            {
               turnLeft();
               move();
               move();
               turnRight();
               move();
            }
         }
         
         if (y == "Down")
         {
            for (int j = 0; j < z; j++)
            {
               move();
               turnRight();
               move();
               move();
               turnLeft();
            }
         }
      }
      
      
      if (x == "Left")
      {
         if(y == "Up")
         {
            for (int j = 0; j < z; j++)
            {
               turnRight();
               move();
               move();
               turnLeft();
               move();
                            
            }
         }
         
         if (y == "Down")
         {
            for (int j = 0; j < z; j++)
            {
               move();
               turnLeft();
               move();
               move();   
               turnRight();
            }
         }

      }
      
   }
   
   
   
   
   
   
   
   
   
   
   
   }