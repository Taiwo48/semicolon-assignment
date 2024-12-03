import java.util.Scanner;

public class LagbajaSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("how many student do you hava: ");
        int students = input.nextInt();

        System.out.print("how many subject do they offer: ");
        int subjects = input.nextInt();

        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");
        



        int[][] scores = new int[students][subjects];

        for (int count = 0; count < students; count++) {
            System.out.println("Enter scores for student " + (count + 1) + ":");
            for (int i = 0; i < subjects; i++) {
                while (true) {
                    System.out.print("Subject " + (i + 1) + ": ");
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
        for (int count = 0; count < students; count++) {
            System.out.println(" ================================\nstudent	subject1	subject2	subject3	total	average		position " + (count + 1) + ":");
            for (int i = 0; i < subjects; i++) {
                System.out.print(scores[count][i]);
            }
            System.out.println();
        }
    }
}

    


