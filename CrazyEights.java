// CrazyEights.java         ITCS
//
// Use conditional statements and loops to
// solve challenges

  
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
   
public class CrazyEights {
   
   public static void main(String[] args) {
      
      String[] choices = {"eightTasks1", "eightTasks2", "eightTasks3", "eightTasks4"};
      String filename = (String)JOptionPane.showInputDialog(null, "Choose a map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      task_01(); //go to the end of the row of beepers
      task_02(); //go to the beeper
      task_03(); //go to the wall
      task_04(); //go to the wall, pick up all the beepers (max one per pile)
      
      task_05(); //go to the wall, pick up all the beepers
      task_06(); //go to the end of the row of beepers, there is one gap exactly one beeper wide
      task_07(); //go to the beeper or the wall.  Count and report the number of steps robot took.
      task_08(); //go until you are next to another robot, then put all your beepers down.
      
   }
   
      
		
	// Go to the end of the row of beepers
   public static void task_01()
   {
      Robot temp = new Robot(1, 1, Display.EAST, 0);
      while(temp.nextToABeeper() == true)
      {
         temp.move();
      }
    
   }
   
   
      
	// Go to the beeper
   public static void task_02() 
   { 
    Robot temp = new Robot(1, 2, Display.EAST, 0);
    while(temp.nextToABeeper() != true)
    {
      temp.move();
    }
      
   }
   
   
      
	// Go to the wall
   public static void task_03() 
   {
      Robot temp = new Robot(1, 3, Display.EAST, 0);
      while(temp.frontIsClear())
      {
         temp.move();
      }
      
   
   }
      
      
      
	// Go to the wall, pick up all the beepers (max one per pile)
   public static void task_04() 
   { 
      Robot temp = new Robot(1, 4, Display.EAST, 0);
      while(temp.frontIsClear())
      {
         if(temp.nextToABeeper())
         {
            temp.pickBeeper();
         }
         temp.move();
         
      }
      
      if(temp.nextToABeeper())
      {
         temp.pickBeeper();
      }
   	
   }
   
   
       
	// Go to the wall, pick up all the beepers 
   public static void task_05() 
   { 
      Robot temp = new Robot(1, 5,Display.EAST, 0);
      while (temp.frontIsClear())
      {
         while(temp.nextToABeeper())
         {
            temp.pickBeeper();
         }
         temp.move();
      }
      while(temp.nextToABeeper())
      {
         temp.pickBeeper();
      }
   	
   
   }
   
   
      
	// Go to the end of the row of beepers, there is one gap exactly one beeper wide
   public static void task_06() 
   {
      Robot temp = new Robot(1, 6, Display.EAST, 0);
      while(temp.nextToABeeper())
      {
         temp.move();
         if(!temp.nextToABeeper())
         {
            temp.move();
            if(!temp.nextToABeeper())
            {
               temp.turnLeft();
               temp.turnLeft();
               temp.move();
               temp.turnLeft();
               temp.turnLeft();
            }
         }
      }
       
   }
   
   
   
   // Go to the beeper or the wall.  Count and report the number of steps robot took.
   public static void task_07() 
   {
      Robot temp = new Robot(1, 7, Display.EAST, 0);
      int counter = 0;
      while(!temp.nextToABeeper() || temp.frontIsClear())
      {
         
         
         
         if(temp.nextToABeeper())
         {
            break;
         }
         if(!temp.frontIsClear())
         {
            break;
         }
         temp.move();
         counter++;
         
      }
      System.out.println(counter);
              
               
   }
   	
      
      
   // Go until you are next to another robot, then put all your beepers down.
   public static void task_08() 
   {
      int beepers = (int)(Math.random() * 21);  // creates a random number between 0 and 20
      Robot temp = new Robot(1, 8, Display.EAST, beepers);
   	
      int x_coord = (int)(Math.random() * 10 + 1);  // creates a random number between 1 and 10
      Robot randomRobo = new Robot (x_coord, 8, Display.WEST, 0);  
   		
   	
      // Your code goes here for temp to walk towards randomRobo
      while(!temp.nextToARobot())
      {
         temp.move();
      }
      while(temp.hasBeepers())
      {
         temp.putBeeper();
      }
         
   
   }
   
   
}