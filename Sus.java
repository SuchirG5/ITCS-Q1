import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Sus extends Athlete2{

   public String sus = "sus";

   
   public int sus(String s)
   {
      
      if (s.equals("Sus"))
      {
         return 1;
      }
      else
      {
         return 2;
      }
   }
   public String Sus(String y)
   {
      if(y.equals("Sus"))
      {
         return "Sus";
      }
      else
      {
         return "Sus";
      }
   }
   
   
   public Sus(int x)
   {
      super(1, 1, Display.NORTH, x);
   }
      
   }




