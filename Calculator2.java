import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Calculator2{

   public static void main(String args[]){
   
   int value1 = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Rise Value"));
   int value2 = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Run Value"));
   int x = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Angle Value"));
   int y = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Hypotnuse Value"));
    
   int a = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Value A (Quadratic solver)"));
   int b = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Value B (Quadratic solver)"));
   int c = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Value C (Quadratic solver)"));
   
   System.out.println("X component: " + getXComponent(y, x));
   System.out.println("Y component: " + getYComponent(y, x));
   
   plotLine(value1, value2);
   
   System.out.println("The equation is: " + a + "x^2 + " + b + "x + " + c);
   double [] aa = quadratic(a, b, c);
   for (int i = 0; i< 2; i++)
   {
      System.out.println("Root " + i + ": " + aa[i]);
   }
   
   
      
       
      
      
      
      
   }
   
   public static double getXComponent(double h, double a)
   {
      double angleRadians = Math.toRadians(a);
      return h * (Math.cos(angleRadians));
   }
   
   public static double getYComponent(double h, double a)
   {
      double angleRadians = Math.toRadians(a);
      return h * (Math.sin(angleRadians));
   }
   
   public static void plotLine(int rise, int run)
   {      
      for(int i = 1; i < 6; i++)
      {
        Display.setSize(20, 20);
        Robot q = new Robot (i*run, i*rise, Display.NORTH, 0);
        System.out.println("(" + i*run + ", " + i*rise + ")");
      }
      
   }
   
   public static double[] quadratic (int a, int b, int c)
   {
      int bb = 0 - b;
      double root1 = (bb + (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
      double root2 = (bb - (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
      double[] roots = {root1, root2}; 
      return roots;
      
   }
   
   
   
   
   
   
}