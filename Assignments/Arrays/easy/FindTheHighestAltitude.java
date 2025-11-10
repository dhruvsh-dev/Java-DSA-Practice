public class FindTheHighestAltitude {
    //Q.12
   public int largestAltitude(int[] gain) {
        int maxAltitude = 0;  
        int current = 0;

        for (int g : gain) {
            current += g;  // update current altitude
            maxAltitude = Math.max(maxAltitude, current);  // check max
        }

        return maxAltitude;
    }
}
