public class MaxProductSubarray {
    public static void main(String[] args) {
        int nums[] = {1, 2, -1, 2, 4};
        int ans = getMaxProduct(nums);
        System.out.println(ans);
    }

    // This method finds the maximum product of a contiguous subarray
    static int getMaxProduct(int nums[]) {

        // minEnd stores minimum product ending at current index
        // (needed because negative * negative = positive)
        int minEnd = nums[0];

        // maxEnd stores maximum product ending at current index
        int maxEnd = nums[0];

        // result stores the final maximum product
        int result = nums[0];

        // Start loop from index 1
        for (int i = 1; i < nums.length; i++) {

            // Current element
            int v1 = nums[i];

            // Product with previous minimum
            int v2 = nums[i] * minEnd;

            // Product with previous maximum
            int v3 = nums[i] * maxEnd;

            // Update max product ending here
            maxEnd = Math.max(v1, Math.max(v2, v3));

            // Update min product ending here
            minEnd = Math.min(v1, Math.min(v2, v3));

            // Update global maximum product
            result = Math.max(result, maxEnd);
        }

        // Return maximum product subarray
        return result;
    }
}

/*
Time Complexity (TC): O(n)
- Array is scanned once.

Space Complexity (SC): O(1)
- Only constant extra variables are used.
*/
