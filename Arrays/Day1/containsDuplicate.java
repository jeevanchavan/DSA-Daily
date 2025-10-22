// public class containsDuplicate {
//     public static void main(String[] args) {
//         int[] nums = {10,2,1,1};
//         Boolean res = containDuplicate(nums);
//         System.out.println(res);
//     }

//     static Boolean containDuplicate(int[] nums){
//         for(int i=0; i<nums.length; i++){
//             for(int j=nums.length-1; j>=i+1; j--){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {10,2,1,12};
        Boolean res = containDuplicate(nums);
        System.out.println(res);
    }

    static Boolean containDuplicate(int[] nums){
        for(int i=0;  i<nums.length-1; i++){
            int j = i+1;
            if(nums[i] == nums[j]){
                return true;
            }
            j++;
        }
        return false;
    }
}
