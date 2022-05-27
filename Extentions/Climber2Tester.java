import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Climber2Tester { 

public static void main (String[] args) 
{
   Display.openWorld(" ");
   Display.setSize(20, 20);
   Display.setSpeed(7);
   
   Climber2 test = new Climber2(1, 1, Display.NORTH, 88888);
   
   test.turnRight();
   test.climb("Right", "Up", 7);
   test.climb("Right" , "Down", 7);
   
   
   
}




}
