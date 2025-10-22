public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,25,30,45,60,70,95,99,100};
        int target = 70;
        int ans = searchElement(arr,target);
        System.out.println(ans);
    }

    static int searchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    } 
}
