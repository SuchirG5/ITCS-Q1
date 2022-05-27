import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class CleverShift{

   public static void shift(Athlete2 temp)
   {
      // making array to store beeper values
      int [] a = {0, 0, 0, 0, 0, 0, 0};
      
      // picking up all the beepers, and countin them
      for(int i = 0; i < 7; i++)
      {
         int counter = 0;
         while(temp.nextToABeeper())
         {
            temp.pickBeeper();
            counter++;
         }
         a[i] = counter;
         temp.move();
      }
      
      temp.turnAround();
      
      // moving to start
      while(temp.frontIsClear())
      {
         temp.move();
      }
      temp.turnAround();
      temp.move();
      
      //shifting the beepers
      for (int j = 0; j<7; j++)
      {
         int k = a[j];
         temp.dropBeepers(k);
            
         temp.move();
       }
       
      }
      
      
   public static void shiftAgain (Athlete2 temp)
   {
      temp.moveX(7);
      temp.turnAround();
      for(int x = 0; x < 7; x++)
      {
         temp.move();
         int counter = 0;
         while(!temp.nextToABeeper())
         {
            temp.move();
         }
         if (temp.nextToABeeper())
         {
            while (temp.nextToABeeper())
            {
               temp.pickBeeper();
               counter++;
            }
            temp.turnAround();
            temp.move();
            temp.dropBeepers(counter);
            temp.turnAround();
            
         }
      }
   }
      
               

         
     
   


   public static void main(String args[])
   {  
      // making robot and map
      String filename = JOptionPane.showInputDialog("What robot world"); 
      Display.openWorld("maps/" + filename + ".map");
      Display.setSpeed(10);
      Athlete2 bob = new Athlete2(1, 1, 4, 0);
      Athlete2 jim = new Athlete2(1, 2, 4, 0);
      
      //calling the shift methods
      shift(bob);
      shiftAgain(jim);
   
   
   
   
   }





}