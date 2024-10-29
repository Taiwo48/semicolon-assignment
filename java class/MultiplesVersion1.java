import java.util.Scanner;
  public class MultiplesVersion1 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
   
  System.out.println("enter a number");
  int number = input.nextInt();
  
  
  if (number % 5 == 0) {
    System.out.print("is a multiples of 5");
  }else if (number % 5 != 0) {
      System.out.print("is not a multiples of 5");
}

   }

}