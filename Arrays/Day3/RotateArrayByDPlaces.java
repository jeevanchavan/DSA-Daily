import java.util.Arrays;


//reversal Approach  
//TC -> O(n)

public class RotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int d = 3;
        rotateArray(nums,d); 
    }

    static void rotateArray(int[] nums, int d){
        if(nums.length == 0){
            return;
        }

        reverse(nums,0,nums.length-1);
        reverse(nums,0,nums.length-d-1);
        reverse(nums,nums.length-d,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

