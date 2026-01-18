// Brute Force -> O(n^2)

// public class SubArraySumEqualsK {
//     public static void main(String[] args) {
//         int nums[] = {1,2,3};
//         int k = 3;
//         int ans = getSum(nums,k);
//         System.out.println(ans);
//     }

//     static int getSum(int[] nums, int k){
//         int count = 0;

//         for(int i=0; i<nums.length; i++){
//             int sum = 0;
//             for(int j=i; j<nums.length; j++){
//                 sum = sum+nums[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
            
//         }

//         return count;
//     }
// }

// Using HashMAps

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int k = 3;
        int ans = getSum(nums,k);
        System.out.println(ans);
    }

    static int getSum(int[] nums, int k){
        // HashMap to store prefixSum and how many times it appears
        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case: prefix sum 0 appears once
        map.put(0, 1);

        int prefixSum = 0; // stores running sum
        int count = 0;     // stores number of subarrays

        // Traverse the array
        for (int num : nums) {

            // Add current element to prefix sum
            prefixSum += num;

            // Check if (prefixSum - k) exists
            // If yes, subarray sum = k found
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store/update current prefix sum count
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        // Return total subarrays with sum k
        return count;

    }
}