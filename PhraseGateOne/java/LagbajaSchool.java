import java.util.Scanner;
public class LagbajaSchool {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.println("how many student do you hava: ");
        int students = input.nextInt();

        System.out.println("how many subject do they offer: ");
        int subjects = input.nextInt();

        System.out.println("saving>>>>>>>>>>>>>>>>>>\nsaved successfully");
        

	int[][] scores = new int[students][subjects];
	        for (int count = 0; count < students; count++) {
            System.out.println("Enter scores for student " + (count + 1) + ":");
            for (int i = 0; i < subjects; i++) {
                while (true) {
                    System.out.print("Enter score for Subject " + (i + 1) + ": ");
            int score = input.nextInt();
            if (score >= 0 && score <= 100) {
            scores[count][i] = score;
                        break;
            } else {
System.out.println("Score should be between 0 and 100. enter again.");
            }
      }
          }
        }
	System.out.print("====================================================================================================================================================\nStudents");
	for (int count = 0;count < subjects;count++){
	     System.out.print("\t\tsub" + (count + 1));
}
	for (int count = 0;count < 1;count++){
	     System.out.print("\t\t     total");
}
	for (int count = 0;count < 1;count++){
	     System.out.print("\t\t\t  average");
}
	System.out.println("\n====================================================================================================================================================");
        for (int count = 0; count < students; count++) {
            int total = 0;
		System.out.print("\nstudent" + (count + 1) + ":\t\t");
            	for (int i = 0; i < subjects; i++) {
			System.out.print((scores[count][i]) + " \t\t"); 
			 total += scores[count][i];     
 }
		  double averageScore = (double) total / subjects;
            System.out.println("  Total: " + total + "\t\t  Average: " + averageScore);

	}
	
	

		
    }
	}

    