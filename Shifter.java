import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Shifter extends Athlete2{

   public Shifter(int x, int y, int b)
   {
      super (x, y, Display.EAST, b);
   }

   public int checkBeepers()
   {
      int counter = 0;
      while (nextToABeeper())
      {
         pickBeeper();
         counter++;
      }
      for (int i = 0; i < counter; i++)
      {
         putBeeper();
      }
      return counter;
   }
   
     

}