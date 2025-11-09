import java.util.List;

public class CountItemsMatchingARule {
    // Q11
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int keyIndex = 0;
        if (ruleKey.equals("color")) keyIndex = 1;
        else if (ruleKey.equals("name")) keyIndex = 2;

        int count = 0;
        for (List<String> item : items) {
            if (item.get(keyIndex).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
