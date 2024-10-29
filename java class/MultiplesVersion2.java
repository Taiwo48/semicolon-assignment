import java.util.Scanner;
  public class MultiplesVersion2 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
        int count = 1;
     while (count <= 3) {

  System.out.println("enter a number");
  int number = input.nextInt();
  if (number % 5 == 0) {
    System.out.println("is a multiples of 5");
  }else if (number % 5 != 0) {
      System.out.print("is not a multiples of 5");
}
    count++;
}
   }

}