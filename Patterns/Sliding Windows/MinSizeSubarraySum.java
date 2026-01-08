public class MinSizeSubarraySum {
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        int ans = findMinSizeSubarray(nums,target);
        System.out.println(ans); 
    }

    static int findMinSizeSubarray(int nums[], int target){
        // Left pointer of window
        int left = 0;

        // Stores current window sum
        int maxSum = 0;

        // Stores minimum length found
        int minLen = Integer.MAX_VALUE;

        // Right pointer moves through array
        for (int right = 0; right < nums.length; right++) {

            // Add current element to window
            maxSum += nums[right];

            // Shrink window while sum >= target
            while (maxSum >= target) {

                // Update minimum length
                minLen = Math.min(minLen, right - left + 1);

                // Remove left element from sum
                maxSum -= nums[left];

                // Move left pointer
                left++;
            }
        }

        // If no valid subarray found
        if (minLen == Integer.MAX_VALUE) return 0;

        // Return answer
        return minLen;
    }
}
