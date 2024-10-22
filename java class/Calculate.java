import java.util.Scanner;

public class Calculate{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
int number1 = input.nextInt();
System.out.print("Enter second integer: ");
int number2 = input.nextInt();
System.out.print("Enter third number:");
int number3 = input.nextInt();
System.out.print("Enter forth number:");
int number4 = input.nextInt();
System.out.print("Enter fifth number:");
int number5 = input.nextInt();
System.out.print("Enter sixth number:");
int number6 = input.nextInt();
System.out.print("Enter seventh number:");
int number7 = input.nextInt();
System.out.print("Enter eighth number:");
int number8 = input.nextInt();
System.out.print("Enter ninth number:");
int number9 = input.nextInt();
System.out.print("Enter tenth number:");
int number10 = input.nextInt();

int sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
System.out.printf("Sum is %d%n", sum);
}
}

