public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2,3,3,4,3};
        int val = 3;
        int ans = removeElement(nums,val);
        System.out.println(ans);
    }

    static int removeElement(int[] nums, int val){
        int i =0;
        int j = nums.length-1;

        while(i <= j){
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}
