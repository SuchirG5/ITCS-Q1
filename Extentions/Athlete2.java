import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Athlete2 extends Robot {

   public Athlete2() 
   {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   
   
   
   public Athlete2(int x, int y, int direction, int beepers) 
   {
      super(x, y, direction, beepers);
   }
   
   public void turnRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   
   
   public void turnAround()
   {
      turnLeft();
      turnLeft();      
   }
   
   public void diagonalNW(int x)
   {
      int j = 0;
   
      for(j=0; j<x; j++)
      {
         move();
         turnLeft();
         move();
         turnRight();
      }
   }
   
   public void diagonalNE(int x)
   {
      int j = 0;
   
      for(j=0; j<x; j++)
      {
         move();
         turnRight();
         move();
         turnLeft();
      }
   }

   
   public void moveAndDrop(int n)
    {
      int j = 0;
      
      for(j=0; j<n; j++)
      {
         move();
         putBeeper();
      }  

    }
   
   public void moveX(int x)
   {
   
      int j = 0;
      
      for(j=0; j<x; j++)
      {
         move();
      }
      

   }


   public void diagonalAndDrop(String y, int x)
   {
   
      int j = 0;
      
      if (y == "NE" || y == "SW")
      {
      
         for(j=0; j<x; j++)
         {
            move();
            turnRight();
            move();
            putBeeper();
            turnLeft();
         }
         
      }
      
      if (y == "NW" || y == "SE")
      {
      
         for(j=0; j<x; j++)
         {
            move();
            turnLeft();
            move();
            putBeeper();
            turnRight();
         }
         
      }

   
   }
   public void teleport(int x, int y)
   {
      explode();
      Athlete2 bob = new Athlete2(x, y, Display.NORTH, Display.INFINITY);
   }
   




}