import java.util.Scanner;
 
  public class DivisibleVersion3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  int sentinel = -1;
   do{
  
  System.out.println("enter number");
  int number = input.nextInt();
  
  if (number % 5 == 0 && number % 11 == 0)  {
     System.out.println("is divisible by five and eleven");
}else{
     System.out.println("is not divisible by five and eleven");
  }
   System.out.print("Do you want to continue (press -1 to stop and 1 to continue):");
     sentinel = input.nextInt();
}while(sentinel != -1);

}
}