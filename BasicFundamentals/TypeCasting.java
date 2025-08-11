public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        long b = a;        // int to long
        float c = b;       // long to float
        System.out.println(c);  // Output: 10.0

        double x = 9.78;
        int y = (int) x;   // double to int (fractional part is lost)

        float f = 44.f;
        int i=(int) f;
        System.out.println(y);  // Output: 9
        System.out.println(i);  // Output: 44
    }
}
