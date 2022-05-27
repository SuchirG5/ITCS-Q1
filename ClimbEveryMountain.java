import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class ClimbEveryMountain{

public static void main(String args[]){


   //making display/map
   Display.openWorld("maps/mountain.map ");
   Display.setSize(16, 16);
   Display.setSpeed(8);
   
   //making climbers
   Climber bob = new Climber(8);
   Climber joe = new Climber(8);
   
   joe.turnRight();
   bob.turnRight();
   joe.move();
   bob.move();
   
   //climbing up
   joe.climbUpRight();
   bob.climbUpRight();
   joe.climbUpRight();
   bob.climbUpRight();
   joe.climbUpRight();
   bob.climbUpRight();
   
   //getting beeper
   joe.climbDownRight();
   bob.climbDownRight();
   joe.climbDownRight();
   bob.climbDownRight();
   joe.pickBeeper();
   joe.turnAround();
   bob.turnAround();
   joe.climbUpLeft();
   bob.climbUpLeft();
   joe.climbUpLeft();
   bob.climbUpLeft();
   
   //climbing down
   joe.climbDownLeft();
   bob.climbDownLeft();
   joe.climbDownLeft();
   bob.climbDownLeft();
   joe.climbDownLeft();
   bob.climbDownLeft();
   
   joe.move();
   bob.move();
   joe.turnRight();
   bob.turnRight();
   joe.putBeeper();
   joe.move();
   bob.move();  

   
   

   

























}






}