import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DanceParty
{
   public static void main(String[] args)
   {
      Display.setSize(30, 30);
      
      Dancer d1 = new Dancer(3, 15, 1, Display.INFINITY);
      Dancer d2 = new Dancer(20, 15, 1,  Display.INFINITY);
      AmogusDancer a1 = new AmogusDancer(1, 1, Display.INFINITY);
      AmogusDancer a2 = new AmogusDancer(5, 1, Display.INFINITY);
      LineDancer l1 = new LineDancer(28, 28, Display.INFINITY);
      LineDancer l2 = new LineDancer(10, 28, Display.INFINITY);
      UptonChuckDancer u1 = new UptonChuckDancer(6, 8, Display.INFINITY);
      UptonChuckDancer u2 = new UptonChuckDancer(4, 8, Display.INFINITY);
      
      
      new Thread(d1).start();
      new Thread(d2).start();
      new Thread(a1).start();
      new Thread(a2).start();
      new Thread(l1).start();
      new Thread(l2).start();
      new Thread(u1).start();
      new Thread(u2).start();
   }
   
   
   
}