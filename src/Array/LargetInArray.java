package Array;

public class LargetInArray {
    public static void main(String[] args) {
        int num[] = {1,2,6,35,999};
        int ans = largest(num);
        System.out.println(ans);
    }
    public static int largest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < num.length ; i++){
            largest = Math.max(largest, num[i]);
        }
        return largest;
    }
}
