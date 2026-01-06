// Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

public class MaxSumSubarray{
    public static void main(String[] args) {
        int nums[] = {100,200,300,400};
        int k=2;
        int res = maxSubarraySum(nums,k);
        System.out.println(res);
    }

    static int maxSubarraySum(int[] nums, int k){
          // Stores sum of current window
        int windowSum = 0;

        // Stores maximum sum found
        int maxSum = 0;

        // Loop through array
        for (int i = 0; i < nums.length; i++) {

            // Add current element to window
            windowSum += nums[i];

            // When window size becomes k
            if (i >= k - 1) {

                // Update max sum
                maxSum = Math.max(maxSum, windowSum);

                // Remove the element going out of window
                windowSum -= nums[i - (k - 1)];
            }
        }

        // Return maximum sum
        return maxSum;
    }
}

// TC -> O(n)
// SC -> O(1)