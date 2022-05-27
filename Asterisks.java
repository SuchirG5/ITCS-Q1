public class Asterisks {

	public static void main(String[] args) {
		
		partA();	
		partB();
		partC();
		partD();
		partE();
		
	}

	/**
	 * Print the asterisks pattern in Part A
	 */
	private static void partA() 
   {
      int count = 0;
		System.out.println("Part A\n");
      System.out.println("*");
		for(int i = 0; i < 9; i++)
      {
         count++;  
         for (int j = 0; j < count; j++ )
         {
            System.out.print("*");
         }
         System.out.println("*");
      }
	}
	
	/**
	 * Print the asterisks pattern in Part B
	 */
	private static void partB() 
   {
      int count = 10;
		System.out.println("\nPart B\n");
		for(int i = 9; i > 0; i--)
      {
         count--;  
         for (int j = 0; j < count; j++ )
         {
            System.out.print("*");
         }
         System.out.println("*");
      }
      System.out.println("*");
	}
	
	/**
	 * Print the asterisks pattern in Part C
	 */
	private static void partC() 
   {
		System.out.println("\nPart C\n");
      int countS = 0;
      int countA = 1;
      for (int i = 0; i < 10; i++)
      {
         for (int j = 9; j > countS; j--)
         {
            System.out.print(" ");
         }
         for(int k = 0; k<countA; k++ )
         {
            System.out.print("*");
         }
         countS++;
         countA++;
         System.out.println();
      }
		
	}
	

	/**
	 * Print the asterisks pattern in Part D
	 */
	private static void partD() 
   {
		System.out.println("\nPart D\n");
      int countS = 0;
      int countA = 0;
      for (int i = 0; i < 10; i++)
      {
         for (int j = 0; j < countS; j++)
         {
            System.out.print(" ");
         }
         for(int k = 10; k>countA; k-- )
         {
            System.out.print("*");
         }
         countS++;
         countA++;
         System.out.println();
      }
	}

	/**
	 * Print the asterisks pattern in Part E
	 */
	private static void partE() 
   {
		System.out.println("\nPart E\n");
      int countS = 6;
      int countA = 1;
      for (int i = 0; i < 6; i++)
      {
         for(int j = 0; j < countS; j++)
         {
            System.out.print(" ");
         }
         for(int k = 0; k < countA; k++)
         {
            System.out.print("*");
         }
         for(int n = 0; n < countS; n++)
         {
            System.out.print(" ");
         }
         countS--;
         countA+=2;
         System.out.println();
      }
      System.out.println("*************");
      countA-=2;
      countS++;
      for (int a = 0; a < 6; a++)
      {
         for(int b = 0; b < countS; b++)
         {
            System.out.print(" ");
         }
         for(int c = 0; c < countA; c++)
         {
            System.out.print("*");
         }
         for(int d = 0; d < countS; d++)
         {
            System.out.print(" ");
         }
         countS++;
         countA-=2;
         System.out.println();
      }

	}

	

	

}