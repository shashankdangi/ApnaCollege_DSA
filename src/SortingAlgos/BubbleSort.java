package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] n = {5,4,1,3,2};
        Bubble(n);
    }
    public static void Bubble(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 -i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
