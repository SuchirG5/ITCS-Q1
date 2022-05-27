// Lab03: Climb Every Mountain
// Climber.java		
	
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

// A Climber Robot can climb up and down mountain
public class Climber extends Athlete {
  		
   // The default constructor starts at (1,1), faces North, and has
	// 1 beeper	
   public Climber()
   {
   	super(1, 1, Display.NORTH, 1);	
   }    
		
		
	// 1 arguement constructor. Can specify x value of position, 
   // all other parameters are default
   public Climber(int x) 
   {
      super(x, 1, Display.NORTH, 1);     
   }
      
   // Climber is facing right and moves up one level and finishes facing right 
   public void climbUpRight() 
   { 
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
      
   	
   // Climber is facing left and climbs 1 level and ends facing left   
   public void climbUpLeft() 
   {	     
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }
      
   	
   // Climber is facing right and climbs down once and ends facing right
   public void climbDownRight() 
   {
      move();
      turnRight();
      move();
      move();
      turnLeft();					
   }
      
   // Climber is facing left and climbs down and ends facing left
   public void climbDownLeft() 
   { 
      move();
      turnLeft();
      move();
      move();
      turnRight();    
   }
}