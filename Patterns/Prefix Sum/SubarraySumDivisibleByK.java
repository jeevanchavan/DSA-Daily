import java.util.HashMap;

public class SubarraySumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int ans = subarraysDivByK(nums, k);
        System.out.println(ans);
    }

    // This method returns the count of subarrays
    // whose sum is divisible by k
    static int subarraysDivByK(int[] nums, int k) {

        // HashMap to store remainder and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case:
        // remainder 0 appears once (empty prefix)
        map.put(0, 1);

        int prefixSum = 0; // stores running sum
        int count = 0;     // stores answer

        // Traverse each element
        for (int num : nums) {
            prefixSum += num;

            // Get remainder of prefix sum
            int rem = prefixSum % k;

            // Handle negative remainder
            if (rem < 0) rem += k;

            // If same remainder appeared before,
            // it means subarray sum is divisible by k
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            // Update remainder frequency
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}

// Time Complexity (TC) ->

// O(n)
// We loop through the array once.

// Space Complexity (SC) ->

// O(k) (or O(n) in worst case)
// HashMap stores remainders.