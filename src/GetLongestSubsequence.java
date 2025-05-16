import java.util.ArrayList;
import java.util.List;

public class GetLongestSubsequence {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        int[] groups = {1, 2, 2, 3, 3};
         List<String> newWords = getLongestSubsequence(words, groups);
         System.out.println(newWords);

    }

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        // Create a list to store the longest subsequence
        List<String> newWords = new ArrayList<>();
        // Add the first word to the list
        newWords.add(words[0]);
        // Iterate through the words and groups
        for (int i = 1; i < words.length; i++) {
            // If the current group is different from the previous group, add the word to the list
            if (groups[i] != groups[i - 1]) {
                newWords.add(words[i]);
            }
        }

        return newWords;
    }

}
