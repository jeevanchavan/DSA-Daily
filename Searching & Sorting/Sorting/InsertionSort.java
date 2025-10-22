import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {30,2,56,4,1,49};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
