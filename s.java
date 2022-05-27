import javax.swing.JOptionPane;


public class s{

public static void main(String args[]){
   
   String[] choices = {"Srikar is a history sweat", "Srikar is a history sweat", "Srikar is a history sweat", "Srikar is a history sweat"};
   String filename = (String)JOptionPane.showInputDialog(null, "Choose an option.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
   if (filename == "Srikar is a history sweat")
   {
      for(int i = 0; true; i++)
      {
         System.out.println("Srikar is a history sweat " + i);
      }
   }












}


}