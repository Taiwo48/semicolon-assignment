import java.util.Scanner;
  public class MultiplesVersion3 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
        int count = 1;
     do {

  System.out.println("enter a number");
  int number = input.nextInt();
  if (number % 5 == 0) {
    System.out.println("is a multiples of 5");
  }else if (number % 5 != 0) {
      System.out.println("is not a multiples of 5");
}
   System.out.println("do you want to continue (print -1 to continue and 1 to stop):");
   count = input.nextInt();
}  while (count != 1);
   }

}