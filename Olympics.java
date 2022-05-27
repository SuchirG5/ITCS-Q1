// Olympics.java			
// ITCS

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

   
public class Olympics {
   
   public static final String[] mapChoices = {"track1", "track2", "track3"};   
   
   public static void main (String[] args) {
   
      String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, mapChoices, mapChoices[0]);
      Display.openWorld("maps/" + mapChoice + ".map");
      Display.setSize(12, 12);
      Display.setSpeed(10);
      
      TrackStar runner = new TrackStar("Upton Chuck");
      
      runner.runLap();
      runner.runLap();
      System.out.println(runner.getName() + " took " + runner.getSteps() + " steps.");
      System.out.println("Laps: " + runner.getLaps());
      System.out.println();
      
      
      // YOUR CODE GOES HERE
      runner.resetCount();
      for(int i = 0; i < 4; i++)
      {
         runner.runLap();
         
      }
      System.out.println("Warm up complete");
      System.out.println(runner.getName() + " ran " + runner.getLaps() + " laps");
      System.out.println(runner.calculateMiles() + " miles");
   
            
   }

}