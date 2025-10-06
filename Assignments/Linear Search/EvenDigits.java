public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check if number contains even number of digits 
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // Count number of digits in a number
    static int digits(int num) {
        if (num == 0) return 1; // special case for 0
        if (num < 0) num = -num; // handle negative numbers

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

     static int digits2(int num) {
        return (int)(Math.log10(num)+1);
     }
}
