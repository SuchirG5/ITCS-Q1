import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class TakeTheField { 

public static void main (String[] args) 
{
   Display.openWorld("maps/arena.map ");
   Display.setSize(10, 10);
   Display.setSpeed(7);
   
   Athlete2 coach = new Athlete2(2, 7, Display.EAST, 0 );
   Athlete2 jim = new Athlete2(1, 1, Display.NORTH, 0 );
   Athlete2 bob = new Athlete2(1, 1, Display.NORTH, 0 );
   Athlete2 joe = new Athlete2(1, 1, Display.NORTH, 0 );
   Athlete2 bill = new Athlete2(1, 1, Display.NORTH, 0 );
   Athlete2 jeff = new Athlete2(1, 1, Display.NORTH, 0 );
   Athlete2 sam = new Athlete2(1, 1, Display.NORTH, 0 );
   
   takeField(jim);
   takeField(bob);
   takeField(joe);
   takeField(bill);
   takeField(jeff);
   takeField(sam);
   
   jim.moveX(2);
   bob.moveX(3);
   joe.moveX(4);
   jim.turnRight();
   joe.turnRight();
   bob.turnRight();
   
   bill.turnLeft();
   bill.diagonalNE(1);
   bill.turnAround();
   
   sam.turnLeft();
   sam.diagonalNE(2);
   sam.turnRight();
   sam.move();
   sam.turnRight();
   
   jeff.moveX(5);
   jeff.turnLeft();
   jeff.move();
   jeff.turnAround();
   
   
}

public static void takeField(Athlete2 temp)
{
   temp.moveX(4);
   temp.turnRight();
   temp.moveX(2);
   
}




}
