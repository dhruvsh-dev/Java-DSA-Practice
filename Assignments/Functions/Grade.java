
import java.util.Scanner;

public class Grade {
    static void printGrade(double marks) {
        if (marks >= 91 && marks <= 100) System.out.println("AA");
        else if (marks >= 81) System.out.println("AB");
        else if (marks >= 71) System.out.println("BB");
        else if (marks >= 61) System.out.println("BC");
        else if (marks >= 51) System.out.println("CD");
        else if (marks >= 41) System.out.println("DD");
        else System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks:");
        double marks=sc.nextDouble();
        printGrade(marks);
    }
}
