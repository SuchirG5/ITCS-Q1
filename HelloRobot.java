import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class HelloRobot {
  
public static void main(String args[]) {
      
         
   Display.openWorld("maps/first.map");
   Display.setSize(10, 10);
   Robot robot = new Robot();
   robot.move();
   robot.move();
   robot.move();
   robot.move();
   robot.move();
   robot.turnLeft();
   robot.move();
   robot.move();
   robot.move();
   robot.move();
   robot.move();
   

   
   
   
   
   
   
   
   
   }







}
