package SortingAlgos;

import java.util.Arrays;

public class InsertionSort {
    //Pick an element from unsorted part and place in the right pos in sorted part
    public static void main(String[] args) {
        int[] num = {5,4,1,3,2};
        InsertionS(num);
    }
    public static void InsertionS(int[] num){
       for(int i = 1 ; i < num.length ; i++){
           int curr = num[i];
           int prev = i - 1;
//           finding correct position to insert
           while(prev >= 0 &&  curr < num[prev]){
               num[prev+1] = num[prev];
               prev--;
           }
           //insertion
           num[prev+1] = curr;


       }
        System.out.println(Arrays.toString(num));
    }
}
