// Easy
// Two pointers used -> T.C = O(n) & S.C = O(1)

import java.util.Arrays;

public class MoveZerosToEnd{
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,4,12};
        moveZeros(nums);
    }

    static void moveZeros(int[] nums){
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<nums.length; i++){
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}