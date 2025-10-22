// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = getIntersec(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getIntersec(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        // Count Occurance in nums1
        for(int num : nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        // Iterate through nums2
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                result.add(num);
                map.put(num,map.get(num)-1);
            }
        }

        // convert arraylist to array
        int[] ans = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }

        return ans;
    }
}


// T.C -> O(N+M)
// S.C -> O(n+k)