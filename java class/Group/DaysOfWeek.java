import java.util.Scanner;
public class DaysOfWeek{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println(" 1. 17\n 2. 18\n 3. 19\n 4. 20\n 4. 21\n 5. 22\n 6. 23\n 7. 24");
		
		int weeksdays = input.nextInt();
		
		switch(weeksdays){
		case 1:
		System.out.println("Sunday");
		break;
		case 2:
		System.out.println("monday");
		break;
		case 3:
		System.out.println("Tuesday");
		break;
		case 4:
		System.out.println("Wenesday");
		break;
		case 5:
		System.out.println("Tuersday");
		break;
		case 6:
		System.out.println("friday");
		break;
		case 7:
		System.out.println("Saturday");
		break;
}
}
}