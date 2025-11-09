public class CheckIfTheSentenceIsPangram {
    //Q.10
    public boolean checkIfPangram(String sentence) {
         boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) return false; // missing a letter
        }

        return true;
    }
}
