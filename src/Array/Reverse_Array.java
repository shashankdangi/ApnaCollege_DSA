package Array;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12};
        reverse(num);
        System.out.println(Arrays.toString(num));
    }
    public static void reverse(int num[]){
        int i = 0;
        int j = num.length-1;
        while(i<j){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }

    }
}
