// Arrays Question -> Daily Challenge leetcode

import java.util.Arrays;

public class LargestPerimeter{
    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        int res = getLargePeri(nums);
        System.out.println(res);
    }

    static int getLargePeri(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int area = 0; 

        for(int i=n-1; i>=2; i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];

            if(b+c > a){
                area = a+b+c;
                break;
            }
        }
        return area;
    }
}