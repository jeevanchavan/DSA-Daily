public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int ans = getEle(nums);
        System.out.println(ans);
    }

    static int getEle(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }
}
