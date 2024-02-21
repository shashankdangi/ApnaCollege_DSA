package Array;

public class Kadanes_Algo {
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSub(num);
    }
    public static void maxSub(int num[]){
        int prefix[] = new int[num.length];
        int max = Integer.MIN_VALUE;
        prefix[0] = num[0];
        for(int i = 1; i < num.length; i++){
            int sum = prefix[i-1] + num[i];
            prefix[i] = sum >= 0 ?  sum : 0;
            max = Math.max(max, prefix[i]);
        }
        System.out.println(max);
    }
}
