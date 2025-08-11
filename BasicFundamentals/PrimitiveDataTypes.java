import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Primitive Data Types with user inputs

        System.out.print("Enter an int: ");
        int a = in.nextInt();

        System.out.print("Enter a short: ");
        short s = in.nextShort();

        System.out.print("Enter a long: ");
        long l = in.nextLong();

        System.out.print("Enter a byte: ");
        byte b = in.nextByte();

        System.out.print("Enter a float: ");
        float f = in.nextFloat();

        System.out.print("Enter a double: ");
        double d = in.nextDouble();

        System.out.print("Enter a char: ");
        char ch = in.next().charAt(0); // Correct way to read a single character

        System.out.print("Enter a boolean (true/false): ");
        boolean bool = in.nextBoolean();

        // Displaying the inputs
        System.out.println("\n--- Entered Values ---");
        System.out.println("int: " + a);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("byte: " + b);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bool);

        //Declaring Primitive Data Types

// In primitive data types, **literals** are the syntactical representations of values.
// For example: numeric, character, boolean, and floating-point values are written using literals.

        // Integer types
        byte byteVal = 100;           // 1 byte: -128 to 127
        short shortVal = 30000;       // 2 bytes: -32,768 to 32,767
        int intVal = 100000;          // 4 bytes: Default integer type
        long longVal = 10000000000L;  // 8 bytes: Larger range, ends with 'L'

        // Floating-point types
        float floatVal = 5.75f;       // 4 bytes: Decimal, ends with 'f'
        double doubleVal = 19.99;     // 8 bytes: Default decimal type

        // Character type
        char charVal = 'A';           // 2 bytes: Single character in single quotes

        // Boolean type
        boolean boolVal = true;       // 1 bit (logical): true or false


        // Outputting all values
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
    }
}
