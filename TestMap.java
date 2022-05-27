import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
   
public class TestMap
{
   public static void main(String[] args) 
   {
      String[] choices = {"eightMore1", "eightMore2", "eightMore3", "eightMore4"};
      String filename = (String)JOptionPane.showInputDialog(null, "Choose a map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      

   
   }
   
}
