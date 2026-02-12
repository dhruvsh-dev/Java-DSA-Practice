class Solution {

    // Function to find GCD
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int[] addFraction(int a[], int b[]) {
        
        int num1 = a[0];
        int den1 = a[1];
        int num2 = b[0];
        int den2 = b[1];

        // Add fractions
        int numerator = num1 * den2 + num2 * den1;
        int denominator = den1 * den2;

        // Simplify fraction
        int g = gcd(numerator, denominator);

        numerator /= g;
        denominator /= g;

        return new int[]{numerator, denominator};
    }
}
