import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low + high) / 2;

        //left half
        mergeSort(arr, low, mid);
        //right half
        mergeSort(arr, mid+1, high);
        //merge condition
        merge(arr,low,mid,high);

    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        // remaining elements in left subarray
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        // remaining elements in left subarray
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        
        // transfering all elements from temporary to arr
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        
    }
}