package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7,8,10,12,13};
        int key = 10;
        System.out.println(linear(num , key));
    }
    public static int linear(int num[], int key){
        for(int i =0 ; i < num.length; i++){
            if (num[i] == key){
                return i;
            }
        }
        return -1;
    }
}
