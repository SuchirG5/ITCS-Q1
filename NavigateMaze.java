
// NavigateMaze.java			ITCS
//
// Use conditional statements and prompt the user which way to turn/move every time the 
// robot gets to a wall or opening

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
	
public class NavigateMaze {
   
   public static final String[] choices = {"Move", "Go Left", "Go Right", "Turn Around", "Quit"};

   public static void main(String[] args) {
     
      Display.openWorld("maps/maze5.map");
      Display.setSize(8, 8);
      Display.setSpeed(7);
      
      Athlete navigator = new Athlete();
      
      navigateMaze(navigator);
      
      printFinishedMessage("Maze Complete");
      
      
   }
   
   // The robot will move through the map until it gets to the beeper
   public static void navigateMaze(Athlete temp) {
   
      while (!temp.nextToABeeper()) {
         chooseNextAction(temp);  
      }
   
   }
   
     
   // Moves the robot based upon the next action chosen.  
   public static void chooseNextAction(Athlete temp) {
      
      String mapChoice = (String)JOptionPane.showInputDialog(null, "Choose an action.", "Maze Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
      
      // the user clicked the cancel button, so just exit
      if (mapChoice == null) {
         System.exit(0);
      }
      
	  //your code goes here
     
      if(mapChoice.equals("Move"))
      {
         if(temp.frontIsClear() == true)
         {
            temp.move();
         }
      } 
      
      if (mapChoice.equals("Go Left")) 
      {
         temp.turnLeft();
         if(temp.frontIsClear() == true)
         {
            temp.move();
         }
      } 
      if (mapChoice.equals("Go Right")) 
      {
         temp.turnRight();
         if(temp.frontIsClear() == true)
         {
            temp.move();
         }
      } 
     } 
	  
      
   
   
   
   
   public static void printFinishedMessage(String message) {
      
      JOptionPane.showMessageDialog(null, message);
   }
}
