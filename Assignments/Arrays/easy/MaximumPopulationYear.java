public class MaximumPopulationYear {
    //Q.19
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[2051]; // Range [1950, 2050]

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            population[birth]++;   // Person born
            population[death]--;   // Person died (not counted in death year)
        }

        int maxYear = 1950;
        int maxPop = 0;
        int current = 0;

        for (int year = 1950; year < 2051; year++) {
            current += population[year];
            if (current > maxPop) {
                maxPop = current;
                maxYear = year;
            }
        }

        return maxYear;
    }
}
