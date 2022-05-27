import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class mathRobot extends Athlete2{


public mathRobot() 
   {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   
   
   
   public mathRobot(int x, int y, int direction, int beepers) 
   {
      super(x, y, direction, beepers);
   }
   
   // use formula: a(x+b)^2+c, n = height of parabola
   // b changes x position, c changes y position
   
   public void quadratic (int a, int b, int c, int n)
   {
      if (c>0)
      {   
         moveX(Math.abs(c));
      }
      else
      {
         turnAround();
         moveX(Math.abs(c));
         turnAround();
      }
      
      
      if (a < 0)
      {
         turnAround();
      }
         
      if (b<0)
      {
         turnRight();
         moveX(Math.abs(b));
         turnLeft();
      }
      else
      {
         turnLeft();
         moveX(Math.abs(b));
         turnRight();
      }
      for(int j = 0; j < n+1; j++)
      {
         int y = j*j;
         turnRight();
         moveX(j);
         turnLeft();
         moveX(y);
         putBeeper();
         turnAround();
         moveX(y);
         turnRight();
         moveX(j);
         turnRight();
         
      }
      
      for(int j = 0; j < n+1; j++)
      {
         int y = j*j;
         turnLeft();
         moveX(j);
         turnRight();
         moveX(y);
         putBeeper();
         turnAround();
         moveX(y);
         turnLeft();
         moveX(j);
         turnLeft();
         
      }

      
      
   }









}