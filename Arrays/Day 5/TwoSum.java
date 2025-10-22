//Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
//brute force approach

import java.util.Arrays;

// public class TwoSum{
//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5};
//         int n=nums.length;
//         int target = 4;
//         int[] result = twoSum(nums,n,target);
//         System.out.println(Arrays.toString(result));
//     }

//     static int[] twoSum(int[] nums, int n, int target){
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i]+nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }

// Optimal approach -> O(n)

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n=nums.length;
        int target = 3;
        int[] result = twoSum(nums,n,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int n, int target){
        // Step 1: store {value, index}
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // original index
        }

        // Step 2: sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: two-pointer
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left][0] + arr[right][0];
            if (sum == target) {
                // return original indices
                return new int[]{arr[left][1], arr[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // not found
    
    }
}