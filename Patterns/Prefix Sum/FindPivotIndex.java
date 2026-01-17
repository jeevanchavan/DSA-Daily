public class FindPivotIndex {
    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};
        int ans = findPivot(nums);
        System.out.println(ans);
    }

    // This method finds the pivot index
    // Pivot index = left sum == right sum
    static int findPivot(int[] nums) {

        // sumLeft[i] stores sum of elements to the left of index i
        int[] sumLeft = new int[nums.length];   

        // sumRight[i] stores sum of elements to the right of index i
        int[] sumRight = new int[nums.length];

        // Build left sum array
        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }

        // Build right sum array
        for (int i = nums.length - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }

        // Check for pivot index
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }

        // If no pivot index found
        return -1;
    }
}

/*
Time Complexity (TC): O(n)
- Three linear loops over the array.

Space Complexity (SC): O(n)
- Two extra arrays are used.
*/
