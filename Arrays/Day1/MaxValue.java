public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,500};
        int res = getMax(arr);
        System.out.println(res);
    }
    static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
