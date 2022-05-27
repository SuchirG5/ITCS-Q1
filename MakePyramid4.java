// MakePyramid4.java        ITCS
//
// Creates a pyramid N columns high

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid4 {

   public static void main (String[] args) {
   
      int numColumns = getNumColumns();
      
      Display.setSize(numColumns, numColumns);
  
      Display.setSpeed(10);
      
      Multitasker worker = new Multitasker();      
                         
      createPyramid(worker, numColumns);
          
      printFinishMessage("Pyramid complete.");
   
      
   }
   
   
   // Prompts and returns the number of columns to build
   public static int getNumColumns() {
   
      String value = JOptionPane.showInputDialog("Enter the number of columns for the pyramid");
      
      int numColumns = Integer.parseInt(value);
      
      return numColumns;
   
   }
   
   // Creates a pyramid with a Multitasker robot numColumns high
   public static void createPyramid(Multitasker temp, int numColumns) {
      
        
   }
   
   
   // *******************************************
   //
   // INCLUDE YOUR METHODS goUp, goBack, moveOver
   //
   // *******************************************
   
   
     
   public static void printFinishMessage(String message) { 
      
      JOptionPane.showMessageDialog(null, message);
   }

}