public class MinSubarraySum {
    public static void main(String[] args) {
        int nums[] = {1, 2, -1, 2, 4};
        int ans = getMinSumSubarray(nums);
        System.out.println(ans);
    }

    // This method finds the minimum sum of a contiguous subarray
    // using modified Kadane’s Algorithm
    static int getMinSumSubarray(int[] nums) {

        // minSum stores the final minimum subarray sum
        int minSum = nums[0];

        // currSum stores the minimum sum ending at current index
        int currSum = nums[0];

        // Start loop from index 1
        for (int i = 1; i < nums.length; i++) {

            // Option 1: extend the previous subarray
            int v1 = currSum + nums[i];

            // Option 2: start a new subarray from current element
            int v2 = nums[i];

            // Choose the smaller value
            currSum = Math.min(v1, v2);

            // Update the global minimum
            minSum = Math.min(minSum, currSum);
        }

        // Return the minimum subarray sum
        return minSum;
    }
}

/*
Time Complexity (TC): O(n)
- The array is traversed only once.

Space Complexity (SC): O(1)
- Only constant extra space is used.
*/
