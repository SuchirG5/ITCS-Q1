//Calculator.java
//ITCS 
//The purpose of this class is to practice writing class methods that return calculated values using the java Math class.  
import javax.swing.JOptionPane;

public class Calculator{
  
   public static void main(String[] args) {
		// Dialogue box allows user input for the values to be calculated and parses them to doubles	
      double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
      double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		
		System.out.println("Addition: "+ value1+" + "+value2+" = "+add(value1,value2));
		System.out.println("Subtraction: "+ value1+" - "+value2+" = "+subtract(value1,value2));
 	   System.out.println("Multiplication: "+ value1+" * "+value2+" = "+multiply(value1, value2));
 	   System.out.println("Division: "+ value1+" / "+value2+" = "+divide(value1, value2));
 	   System.out.println("Maximum value: "+ findMax(value1, value2));
 	   System.out.println("Minimum value: "+ findMin(value1, value2));
 	   System.out.println("Square root of "+ value1+":"+ " = "+ squareRoot(value1));
 	   System.out.println("Power: "+ value1+"^"+value2+" = "+ power(value1, value2));
      System.out.println("Pythagorean: for a = " + value1 + " and b = " + value2 + " then c = " + pythagorean(value1, value2));
    
   }
  
   // Example method: add method returns the sum of two doubles
   public static double add(double input1, double input2)
   {
      return input1 + input2;
   }
  
   // Find the difference of input1 and input2
    public static double subtract(double input1, double input2) 
    {
      return input1 - input2;
    }
  
    public static double multiply(double x, double y)
    {
      return x*y;
    }
    
    public static double divide(double x, double y)
    {
      return x/y;   
    }
    
    public static double findMax(double x, double y)
    {
      if (x>y)
      {
         return x;
      }
      else
      {
         return y;
      }

    }
    
    public static double findMin(double x, double y)
    {
      if (x<y)
      {
         return x;
      }
      else
      {
         return y;
      }
    }
    
    public static double squareRoot(double x)
    {
      return Math.sqrt(x);
    }
    
    public static double power (double x, double y)
    {
      return Math.pow(x, y);
    }
    public static double pythagorean(double x, double y)
    {
      return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
  
 

}