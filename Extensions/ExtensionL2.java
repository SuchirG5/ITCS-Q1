import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class ExtensionL2{

public static void main(String args[]){

   Display.setSize(9, 9);
   Display.setSpeed(4);
   
   Athlete2 jim = new Athlete2(5,1,Display.NORTH,40);
   
   //line 1
   
   jim.putBeeper();
   jim.moveAndDrop(8);
   jim.turnRight();
   jim.moveX(4);
   
   //diagonal 1
   jim.putBeeper();
   jim.turnRight();
   jim.diagonalAndDrop("SW", 8);
   jim.turnAround();
   jim.moveX(4);
   
   //line 2
   
   jim.turnRight();
   jim.putBeeper();
   jim.moveAndDrop(8);
   jim.turnRight();
   jim.moveX(4);
   
   //diagonal 2
   jim.putBeeper();
   jim.turnAround();
   jim.diagonalAndDrop("NW", 8);
   


 











}



}