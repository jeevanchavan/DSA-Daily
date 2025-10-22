//import java.util.*;

import java.util.Arrays;

public class SwapNumbers{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        numSwap(arr,1,4);

        //System.out.println(Arrays.toString(arr));
    }

    static void numSwap(int[] arr, int index1, int index2){
        int temp;
        for(int i=0; i<arr.length; i++){
            temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

        // for(int num: arr){
        //     System.out.print(num+ " ");
        // }
        System.out.println(Arrays.toString(arr));
    }
}