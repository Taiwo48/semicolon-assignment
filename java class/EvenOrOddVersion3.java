import java.util.Scanner;
  
   public class EvenOrOddVersion3 {
	public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
        
        
    	 int count = -1;
    	do {
      System.out.print("Enter a number");
      int anumber = input.nextInt();
   		
		if (anumber % 2 == 0) {
			System.out.println("even");
		}
   		else {
   			System.out.println("odd"); 
}
      System.out.println("Do you want to continue (press -1 to stop and 1 to continue):");
        
         count = input.nextInt();
} while (count != -1);
 
}

 }