// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// T.C -> O(N) S.C -> O(N)

import java.util.HashMap;

public class MajorityElement{
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = getMajority(nums);
        System.out.println(ans);
    }

    static int getMajority(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        // Step 1: Count frequencies
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }

            if(map.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }
}