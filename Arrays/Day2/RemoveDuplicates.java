//import java.util.Arrays;

//Brute Force

// public class RemoveDuplicates{
//     public static void main(String[] args) {
//         int[] arr = {1,1,2,3,3};
//         removeDuplicate(arr);
//     }

//     static void removeDuplicate(int[] arr){
//         int[] nums = new int[arr.length];
//         int k=0;

//         for(int i=0; i<arr.length; i++){
//             if(i == arr.length-1 || arr[i] != arr[i+1]){
//                 nums[k++] = arr[i];
//             }
//         }

//         System.out.println(Arrays.toString(nums));
//     }
// }

//Optimal Approach

public class RemoveDuplicates{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        int k = removeDuplicate(arr);
        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int removeDuplicate(int[] arr){
        int j=0;
        for(int i=1; i<arr.length; i++){
            if(arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;
    }
}