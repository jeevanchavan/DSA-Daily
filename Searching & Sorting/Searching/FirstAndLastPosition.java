import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = getPosition(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getPosition(int[] nums, int target){
        // search for left occrance
        int l = leftOccurance(nums,target);
        int r = rightOccurance(nums,target);

        return new int[]{l,r};
    }

    static int leftOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int leftCount = -1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(target > nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                leftCount = mid;
                end = mid-1;
            }
        }
        return leftCount;
    }

    static int rightOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int rightCount = -1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(target > nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                rightCount = mid;
                start = mid+1;
            }
        }
        return rightCount;
    }
}
