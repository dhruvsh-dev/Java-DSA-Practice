import java.util.ArrayList;
import java.util.List;
//Q6
public class KidsWithTheGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 1. Find the maximum number of candies currently held by any kid.
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        // 2. Determine if each kid, with extraCandies, reaches or exceeds the maximum.
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            // Check if the current kid's potential total >= the maximum existing total.
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}
