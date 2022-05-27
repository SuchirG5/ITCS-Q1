// MakePyramid2.java        ITCS    Shell Code

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid2 {

   public static void main (String[] args) {
   
      Display.setSize(8, 8);
      Display.setSpeed(7);
      
      // Create a Multitasker
      
      Multitasker joe = new Multitasker(1, 1, Display.NORTH, 10);
      
      // Code to make the pyramid goes here
      
      
      //row 1
      
      joe.turnRight();
      joe.dropAndMove();
      joe.dropAndMove();
      joe.dropAndMove();
      joe.putBeeper();
      joe.turnLeft();
      
      //row 2
      
      joe.moveAndDrop();
      joe.turnLeft();
      joe.moveAndDrop();
      joe.moveAndDrop();
      joe.turnAround();
      joe.move();
      joe.turnLeft();
      
      //row 3
      
      joe.moveAndDrop();
      joe.turnRight();
      joe.moveAndDrop();
      joe.turnLeft();
      
      //row 4
      
      joe.moveAndDrop();
      
      
            
      printFinishMessage("Pyramid is complete");
   
   }

   // Prints the message to a dialog box
   public static void printFinishMessage(String message) {     
      JOptionPane.showMessageDialog(null, message);
   }
     
     
     
      
}