import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int subjects = 5;

        System.out.println("Enter GPA for " + subjects + " subjects:");

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + " GPA: ");
            double gpa = sc.nextDouble();

            // Validate input between 0.0 and 10.0
            if (gpa < 0 || gpa > 10) {
                System.out.println("Invalid GPA! Please enter a value between 0 and 10.");
                i--; // retry the current subject
                continue;
            }

            total += gpa;
        }

        double cgpa = total / subjects;
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
    }
}
