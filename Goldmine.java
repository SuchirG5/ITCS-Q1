import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Goldmine extends Athlete {

public static void main(String args[])
{

   // creating display
   Display.openWorld("maps/mine.map ");
   Display.setSize(10, 10);
   Display.setSpeed(6);
   
   //creating miners
   Miner r1 = new Miner(3, 6, Display.EAST, 0);
   Miner r2 = new Miner(8, 6, Display.SOUTH, 0);
   Miner r3 = new Miner(8, 1, Display.WEST, 0);
   Miner r4 = new Miner(1, 1, Display.NORTH, 0);
   Miner r5 = new Miner(1, 8, Display.EAST, 0);
   
   // First Robot
   r1.move();
   for (int i = 0; i < 6; i++)
   {
      r1.pickBeeper();   
   }
  
   for (int i = 0; i < 4; i++)
   {
      r1.move();   
   }
   
   for (int i = 0; i < 6; i++)
   {
      r1.putBeeper();   
   }
   
   
   //Second Robot
   for (int i = 0; i < 6; i++)
   {
      r2.pickBeeper();   
   }
   
   for (int i = 0; i < 4; i++)
   {
      r2.move();   
   }
   
   for (int i = 0; i < 7; i++)
   {
      r2.pickBeeper();   
   }
   
   r2.move();
   
   for (int i = 0; i < 13; i++)
   {
      r2.putBeeper();   
   }
   
   //Third Robot
   for (int i = 0; i < 13; i++)
   {
      r3.pickBeeper();   
   }
   
   for (int i = 0; i < 4; i++)
   {
      r3.move();   
   }
   for (int i = 0; i < 8; i++)
   {
      r3.pickBeeper();   
   }
   
   for (int i = 0; i < 3; i++)
   {
      r3.move();   
   }
   
   for (int i = 0; i < 21; i++)
   {
      r3.putBeeper();   
   }
   
   //Fourth Robot
   for (int i = 0; i < 21; i++)
   {
      r4.pickBeeper();   
   }

   for (int i = 0; i < 6; i++)
   {
      r4.move();   
   }
   
   for (int i = 0; i < 9; i++)
   {
      r4.pickBeeper();   
   }
   
   r4.move();
   
   for (int i = 0; i < 30; i++)
   {
      r4.putBeeper();   
   }
   
   //Fifth Robot
   for (int i = 0; i < 30; i++)
   {
      r5.pickBeeper();   
   }

   
   for (int i = 0; i < 9; i++)
   {
      r5.move();   
   }
   
   for (int i = 0; i < 30; i++)
   {
      r5.putBeeper();   
   }
   
   r5.move();
   
   
   //explode
   
   r1.explode();
   r2.explode();
   r3.explode();
   r4.explode();



   





   



   
   


   
   

   







}




}