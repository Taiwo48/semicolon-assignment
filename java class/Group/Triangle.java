import java.util.Scanner;

	public class Triangle {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.println("Enter length of a triangle");
	int length = input.nextInt();
	
  if(length == 1){
	System.out.println("Equilateral triangle");
}
  if(length == 2){
	System.out.println("isoseles triangle");
}
  if(length == 3){
	System.out.println("Scalens triangle");
}	
  if(length >= 4){
	System.out.println("not a triangle");
}
}
}