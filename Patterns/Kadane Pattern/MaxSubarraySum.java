public class MaxSubarraySum{
    public static void main(String[] args) {
    int nums[] = {1, 2, -1, 2, 4};
    int ans = getMaxSumSubarray(nums);
    System.out.println(ans);
}

// This method finds the maximum sum of a contiguous subarray
// using Kadane’s Algorithm
static int getMaxSumSubarray(int[] nums) {

    // maxSum stores the final maximum subarray sum
    int maxSum = nums[0];

    // currSum stores the maximum sum ending at current index
    int currSum = nums[0];

    // Start loop from index 1
    for (int i = 1; i < nums.length; i++) {

        // Option 1: extend the previous subarray
        int v1 = currSum + nums[i];

        // Option 2: start a new subarray from current element
        int v2 = nums[i];

        // Choose the better option
        currSum = Math.max(v1, v2);

        // Update the global maximum
        maxSum = Math.max(maxSum, currSum);
    }

    // Return the maximum subarray sum
    return maxSum;
}

/*
Time Complexity (TC): O(n)
- We loop through the array only once.

Space Complexity (SC): O(1)
- Only constant extra variables are used.
*/

}