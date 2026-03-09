public class GFG {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(isPerfect(n) ? "true" : "false");
    }
}
