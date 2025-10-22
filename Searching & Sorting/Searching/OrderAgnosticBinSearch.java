public class OrderAgnosticBinSearch {
    public static void main(String[] args) {
        int[] arr = {100,60,50,40,30,20,10};
        int target = 60;
        int ans = getSearch(arr,target);
        System.out.println(ans);
    }

    static int getSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        Boolean AscCheck = isAsc(arr,start,end);

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                    return mid;
                }

            if(AscCheck){
                if(target > arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target > arr[mid]){
                    end= mid-1;;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    static boolean isAsc(int[] arr, int start, int end){
        if(arr[start] < arr[end]){
            return true;
        }
        return false;
    }
}
