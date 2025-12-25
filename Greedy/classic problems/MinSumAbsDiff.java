// Greedy Pattern:
// - Sort both arrays
// - Pair smallest with smallest
// - This gives minimum total absolute difference

// Key Idea: Make locally optimal choice to get global optimum


import java.util.*;

public class MinSumAbsDiff {
    public static void main(String[] args) {
        int[] A = {4,1,8,7};
        int[] B = {2,3,5,6};

        // Sort both arrays
        // This helps pair closest values together
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0; // stores minimum sum of absolute differences

        // Traverse both arrays and add absolute difference
        for(int i = 0; i < A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        // Print result
        System.out.println("Min absolute sum difference: " + minDiff);
    }
}
// TC: O(n log n) → sorting both arrays
// SC: O(1) → no extra space used (ignoring sort space)
