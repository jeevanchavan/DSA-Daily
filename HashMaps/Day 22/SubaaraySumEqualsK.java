// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// T.C -> o(N) S.C -> o(1)

import java.util.HashMap;

public class SubaaraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;

        int ans = getSubarraySum(nums,k);
        System.out.println(ans);
    }

    static int getSubarraySum(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int prefixSum = 0;

        // Base case: one way to have sum = 0 before starting
        map.put(0,1);

        for(int num : nums){
            prefixSum += num;

            // Check if there’s a previous prefix sum that forms k
            if(map.containsKey(prefixSum-k)){
                count += map.get(prefixSum-k);
            }

            // Update frequency of current prefix sum
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}
