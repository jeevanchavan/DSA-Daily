//Given a non-empty array of integers nums,
//  every element appears twice except for one. Find that single one.

//Brute Force Approach

// public class SingleNumberFind{
//     public static void main(String[] args) {
//         int[] arr = {1,1,2,3,4,2,4};
//         int res = findSingleNumber(arr);
//         System.out.println(res);
//     }

//     static int findSingleNumber(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             int count = 0;
//             for(int j=0; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
// }

//Optimal

public class SingleNumberFind{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,2,4};
        int res = findSingleNumber(arr);
        System.out.println(res);
    }

    static int findSingleNumber(int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
           result = result ^ arr[i];
        }
        return result;
    }
}