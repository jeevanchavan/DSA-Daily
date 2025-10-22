public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = getSecLargest(arr);
        System.out.println("Second largest:"+res);
    }

    static int getSecLargest(int[] arr){
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            }
            else if(arr[i] > secLarge && arr[i]!=large){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }
}
