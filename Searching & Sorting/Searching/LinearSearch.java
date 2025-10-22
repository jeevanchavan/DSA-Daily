public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,5,25,79,27,40};
        int target = 79;
        int ans = getElement(arr,target);
        System.out.println(ans);
    }

    static int  getElement(int[] arr, int target){
        if(arr.length == 0) return 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}