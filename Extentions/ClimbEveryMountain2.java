import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class ClimbEveryMountain2{

public static void main(String args[]){


   //making display/map
   Display.openWorld("maps/mountain3.map ");
   Display.setSize(16, 16);
   Display.setSpeed(8);
   
   //making climbers
   Climber2 bob = new Climber2(8, 1, Display.NORTH, 0);
   Climber2 jim = new Climber2(8, 1, Display.NORTH, 0);
   
   //pick up and hand off beeper
   bob.turnRight();
   bob.move();
   bob.climb("Right", "Up", 1);
   bob.pickBeeper();
   bob.turnAround();
   bob.climb("Left", "Down", 1);
   bob.move();
   bob.putBeeper();
   
   //put beeper on mountain
   jim.pickBeeper();
   jim.turnLeft();
   jim.move();
   jim.climb("Left", "Up", 5);
   jim.putBeeper();
   
   //climb down mountain
   jim.turnAround();
   jim.climb("Right", "Down", 5);
   jim.move();
   jim.turnLeft();
   bob.turnRight();
   









}




}