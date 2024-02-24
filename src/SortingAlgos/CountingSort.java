package SortingAlgos;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        countsort(arr);
    }
    public static void countsort(int[] num){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< num.length; i++){
            largest = Math.max(largest, num[i]);
        }
        int count[] = new int[largest+1];

        for(int i = 0; i < num.length; i++){
            count[num[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                num[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
