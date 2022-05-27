//Angry Robots
//ITCS and Physics - Integrated Projectile Project

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class AngryRobotsCopy{

   // global variables
   // These can be used in any method in this program without having to pass the variable as a parameter
   // Note that Ay and Ax are declared final, they cannot be changed   
   public static double Ay = -9.8;
   public static final double Ax = 0; 
   
   // Extention #1
   public static double yReset = Double.parseDouble(JOptionPane.showInputDialog("Please enter a height"));
   
   public static double y = yReset;
   public static double x = 0.0;
   public static double v0x = 0.0;
   public static double v0y = 0.0;
   public static double t = 0.0;
   public static double dt = 0.1;
     
    
   public static void main(String[] args){
	  /*
      Extention #4
     */
      Display.setSpeed(10);
      String[] choices = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
      String planet = (String)JOptionPane.showInputDialog(null,"Choose a planet", "Planet Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
      switch (planet)
      {
         case "Mercury": Ay = -3.61;
                         break;
         case "Venus":   Ay = -8.83;
                         break;
         case "Earth":   Ay = -9.8;
                         break;
         case "Mars":    Ay = -3.75;
                         break;
         case "Jupiter": Ay = -26;
                         break;
         case "Saturn":  Ay = -11.2;
                         break;
         case "Uranus":  Ay = -10.5;
                         break;
         case "Neptune": Ay = -13.3;
                         break;
         default:        Ay = -9.8;
                         break;
      }
     
     
      // User input to define initial velocity and launch angle
      // the parseDouble method converts the string input to a double
      double v0 = Double.parseDouble(JOptionPane.showInputDialog("Please enter an initial velocity in m/s"));
      double angleDegrees = Double.parseDouble(JOptionPane.showInputDialog("Please enter an initial angle in degrees"));
   
      // Calculate x and y initial velocities
      v0x = calculateV0X(v0, angleDegrees);
      System.out.println("V0x: " + v0x);
      
      v0y = calculateV0Y(v0, angleDegrees);
      System.out.println("V0y: " + v0y);
      
 
      
           
   
   
      // Step 1: Complete the calculateX and calculateY methods to calculate x and y postions 
      // using the kinematic equations; 
      // Complete the calculateProjectile method to calculate all the x and y positions until it hits the ground
      // Invoke the calculateProjectile method here
      
      //calculateProjectile(v0x, v0y);  
      
        
  
      // Step 2: Complete the plotProjectile method and invoke it in your calculateProjectile method
      // to place a new Robot at each calculated x,y location
      // No need to add code here for this step
      
      
      
      // Step 3: Create the optimalAngle method to determine the optimal launch angle for max range
      // Tests all angles between 0 and 90 degrees
      // invoke it here and store what it returns into a double
      
      double opAngle = optimalAngle(v0);
      
      
       
       // Step 4: Create the plotRelatedAngles method and invoke it here
       // Plot projectile at optimal angle, +/- 15 degrees and +/- 30 degrees from optimal angle
       
       plotRelatedAngles(opAngle, v0);
      
      
      
      
   }
   
      
   /**
    * Calculates the initial x-velocity
    * @param v0 the initial velocity
    * @param angleDegrees the angle, in degrees
    * @return the initial x-velocity
    */
   public static double calculateV0X(double v0, double angleDegrees) {
      
      double rads = Math.toRadians(angleDegrees);
      return v0*Math.cos(rads);
   }
   
   
   /*
    * Calculates the initial y-velocity
    * @param v0 the initial velociy
    * @param angleDegrees the angle, in degrees
    * @return the initial y-velocity
    */
   public static double calculateV0Y(double v0, double angleDegrees) {
      
      double rads = Math.toRadians(angleDegrees);
      
      return v0*Math.sin(rads);
   }
   
   
   /**
    * Finds the x-coordinate with the given initial x-velocity, v0x,
    * at the given time, t.
    * @param v0x the initial x-velocity
    * @param t the given time
    * @return the x-coordinate with the initial x-velocity at the given time
    */
   public static double calculateX(double v0x, double t){
      
      
      return v0x*t;
      
   }
   
   
   
   
   /**
    * Finds the y-coordinate with the given initial y-velocity, v0y,
    * at the given time, t.
    * @param v0y the initial y-velocity
    * @param t the given time
    * @return the y-coordinate with the initial y-velocity at the given time
    */
   public static double calculateY(double v0y, double t){
   
      return (v0y*t) + 0.5*Ay*Math.pow(t, 2);
   }

   
   // Step 1:  Invoke method to calculate x and y postions and plot the projectile
   // as long as y is above ground level
   // print x,y, and t to track calculations
    /**
    * Calculates x and y positions to trace the path of the projectile until it hits the ground
    * @param v0x the initial x-velocity
    * @param v0y the initial y-velocity
    */   
   public static void calculateProjectile(double v0x, double v0y)
   {
     //your code here
     
      while(y>=0)
      {
         x = calculateX(v0x, t);
         y = calculateY(v0y, t) + yReset;
         
         plotProjectile(x, y);
         
         System.out.println("[" + t + ", " + x + ", " + y + "]");
         t += dt;
      }   
   }
   
   // Step 2: plot Robots
    /**
    * Declares and instantiates a robot at the given point (x, y)
    * Creates a 50x50 blank coordinate map
    * @param x the x-coordinate
    * @param y the y-coordinate
    */   
   public static void plotProjectile(double x, double y)
   {
     
     Display.setSize(500, 500);
     new Robot((int)(x + 0.5), (int)(y + 0.5), Display.NORTH, 0); 
   }
   
   
    // Step 3: Determine the optimal launch angle for max range
    // Tests all angles between 0 and 90 degrees
    // add method here
    /**
    * Determines optimal angle for maximum range 
    * by testing angles between 0-90 for a set initial velocity
    * @param v0 the initial velocity
    * @return the optimal angle (in degrees)
    */   
    
    public static double optimalAngle(double v)
    {
      x = 0;
      y = yReset;
      t = 0;
      double vX =0;
      double vY = 0;
      
      double max= 0;
      double angleL = 0;
      
      //System.out.println(y);
      
      for(int i = 0; i < 90; i++)
      {
         vX = calculateV0X(v, i);
         vY = calculateV0Y(v, i);
         while(y>= 0)
         {
            x = calculateX(vX, t);
            y = calculateY(vY, t) + yReset;
            t += dt;

         }
            
         max = Math.max(max,x);
         System.out.println("Angle = "+ i + ": (" +"max = " + max + "  Distance = "+x + ")" );

         if(max <= x)
         {
            angleL = i;
         }

         
         y = yReset;
         x = 0;
         
      }
      
      System.out.println("Optimal Angle: " + angleL);
      
      
      return angleL;
      
     }
    
    
    
    
    // Step 4: 
    // Plot the given angle, +/- 15 degrees and +/- 30 degrees from given angle
    // add method here
    
    public static void plotRelatedAngles(double angle, double velocity)
    {
         t = 0;
         x = 0;
         y = yReset;
         double vX = 0;
         double vY = 0;
         
         for(int i = -30; i < 31; i += 15)
         {
            double rAngle = angle + i;
            while(y >= 0)
            {
               vX = calculateV0X(velocity, rAngle);
               vY = calculateV0Y(velocity, rAngle);
               
               x = calculateX(vX, t);
               y = calculateY(vY, t) + yReset;
               
               plotProjectile(x, y);
               
               
               t += dt;
            }
            System.out.println("At " + rAngle + " degrees, the range is: " + x);
            
            t = 0;
            x = 0;
            y = yReset;
            vX = 0;
            vY = 0;
          }
    
    }
    
 
 

}