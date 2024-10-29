import java.util.Scanner;
 
  public class DivisibleVersion1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
  
  System.out.println("enter number");
  int number = input.nextInt();
  
  if (number % 5 == 0 && number % 11 == 0)  {
     System.out.println("is divisible by five and eleven");
}else{
     System.out.println("is not divisible by five and eleven");
  }



}
}