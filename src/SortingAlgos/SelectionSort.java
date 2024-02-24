package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    //Pick the smallest(from unsorted) , and put it at the beggining;
    public static void main(String[] args) {
        int[] n = {5,4,3,6,1,2};
        SelectionS(n);
    }
    public static void SelectionS(int num[]){
        for(int i = 0; i < num.length-1; i++){
             int min = i;
            for(int j = i+1; j< num.length; j++){
                if(num[j] < num[min]){
                    min = j;
                }
            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
