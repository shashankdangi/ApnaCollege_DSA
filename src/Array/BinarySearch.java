package Array;

public class BinarySearch {
    public static void main(String[] args) {
            //pre requisite [must be given a sorted array]
        int num[] = {2,4,6,8,10,12,14};
        int key = 10;
        int ans = binary(num, key);
        System.out.println("At index : " + ans);
    }
    public static int binary(int num[], int key){
        int i = 0;
        int j = num.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                i = mid + 1;
            }else{
                j = mid - 1;
            }

        }
        return -1;
    }
}
