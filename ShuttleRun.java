import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class ShuttleRun{

public static void runTheRace(Racer joe)
{
   joe.shuttle(3, 5);
   joe.shuttle(5, 2);
   joe.shuttle(6, 3);
   joe.shuttle(9, 7);
   joe.move();
}

public static void main(String args[]){


   Display.openWorld("maps/shuttlerun.map ");
   Display.setSize(13, 10);
   Display.setSpeed(10);
   
   Racer bob = new Racer(1);
   Racer jim = new Racer(4);
   Racer joe = new Racer(7);
   
   //part 2
   runTheRace(bob);
   runTheRace(jim);
   runTheRace(joe);
   
   //initial code
   /*
   bob.move();
   bob.jumpRight();
   bob.sprint(3);
   bob.pick(5);
   bob.turnAround();
   bob.sprint(3);
   bob.jumpLeft();
   bob.move();
   bob.put(5);
   
   bob.turnAround();
   
   bob.move();
   bob.jumpRight();
   bob.sprint(5);
   bob.pick(2);
   bob.turnAround();
   bob.sprint(5);
   bob.jumpLeft();
   bob.move();
   bob.put(2);
   
   bob.turnAround();
   
   bob.move();
   bob.jumpRight();
   bob.sprint(6);
   bob.pick(3);
   bob.turnAround();
   bob.sprint(6);
   bob.jumpLeft();
   bob.move();
   bob.put(3);
   
   bob.turnAround();
   
   bob.move();
   bob.jumpRight();
   bob.sprint(9);
   bob.pick(7);
   bob.turnAround();
   bob.sprint(9);
   bob.jumpLeft();
   bob.move();
   bob.put(7);
   */
   
   
   //part 1
   /*
   bob.shuttle(3, 5);
   bob.shuttle(5, 2);
   bob.shuttle(6, 3);
   bob.shuttle(9, 7);
   bob.move();
   
   jim.shuttle(3, 5);
   jim.shuttle(5, 2);
   jim.shuttle(6, 3);
   jim.shuttle(9, 7);
   jim.move();
   
   joe.shuttle(3, 5);
   joe.shuttle(5, 2);
   joe.shuttle(6, 3);
   joe.shuttle(9, 7);
   joe.move();
   */
   

   




}



}
