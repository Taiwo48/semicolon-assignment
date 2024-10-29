import java.util.Scanner;
   public class IncreasingOrDecreasingVersion1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
    System.out.println("Enter first number");
    int number1 = input.nextInt();
   
    System.out.println("Enter second number");
    int number2 = input.nextInt();
   
    System.out.println("Enter third number");
    int number3 = input.nextInt();

    if (number1>number2 && number2>number3){
    System.out.println("decreasing order");
}
    else if (number1<number2 && number2<number3){
    System.out.println("increasing order");
     
   }
  

  
    }
}

    
    
 
    
