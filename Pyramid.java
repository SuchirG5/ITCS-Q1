import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Pyramid{

public static void main(String args[]){


   Display.openWorld(" ");
   Athlete bob = new Athlete(1, 1, Display.NORTH, 10);
   
   
   //row 1
   bob.turnRight();
   bob.putBeeper();
   bob.move();
   bob.putBeeper();
   bob.move();
   bob.putBeeper();
   bob.move();
   bob.putBeeper();
   
   //row 2
   bob.turnLeft();
   bob.move();
   bob.putBeeper();
   bob.turnLeft();
   bob.move();
   bob.putBeeper();
   bob.move();
   bob.putBeeper();
   bob.turnAround();
   bob.move();
   
   //row 3
   bob.turnLeft();
   bob.move();
   bob.putBeeper();
   bob.turnRight();
   bob.move();
   bob.putBeeper();
   
   
   //row 4
   bob.turnLeft();
   bob.move();
   bob.putBeeper();
   
   
  /* bob.turnRight();
   bob.diagonalP();*/
      





}











}