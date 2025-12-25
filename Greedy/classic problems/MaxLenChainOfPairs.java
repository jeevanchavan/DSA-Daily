import java.util.Arrays;
import java.util.Comparator;

public class MaxLenChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = {{1,2},{2,3},{3,4}};

        // Sort pairs by their ending value
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int maxLen = 1;                // at least one pair can always be chosen
        int lastEnd = pairs[0][1];     // end of the last selected pair

        // Traverse remaining pairs
        for (int i = 1; i < pairs.length; i++) {

            // If current pair can be chained with previous one
            if (pairs[i][0] > lastEnd) {
                maxLen++;              // increase chain length
                lastEnd = pairs[i][1]; // update last selected end
            }
        }

        // Return maximum length of chain
        System.out.println("Max Length Chain is: "+maxLen);
    }
}

// TC: O(n log n) → sorting
// SC: O(1) → no extra space (ignoring sort space)