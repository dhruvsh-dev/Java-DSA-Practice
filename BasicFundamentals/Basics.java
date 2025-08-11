import java.util.Scanner; // For taking input

public class Basics {
    public static void main(String[] args) { //Main function
        // Print statements
        System.out.print("Hii");           // Same line
        System.out.println(" Dhruv");      // New line

        // Taking input from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");  // Prompt input
        int a = in.nextInt();
        
        System.out.print("You entered: " +a);   

        //it is single line comment
        /*
         Multiple line 
         comments 
         */  
    }
}
