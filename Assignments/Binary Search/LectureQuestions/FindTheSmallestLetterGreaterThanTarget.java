public class FindTheSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'd', 'f', 'g'}; 
        System.out.println(nextGreatestChar(arr,'d'));
    }

    static char nextGreatestChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if target is smaller, the answer might be on the left
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // wrap-around logic using modulo
        return letters[start % letters.length];
    }
}
