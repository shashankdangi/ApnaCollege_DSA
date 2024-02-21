package Array;

public class Max_Subarray_Sum {
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSub(num);
    }
    public static void maxSub(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){

            for(int j = i; j< num.length; j++){
                int sum = 0;
                for(int k = i; k<=j ; k++){
                    sum += num[k];
                }
                max = Math.max(max,sum);
            }

        }
        System.out.println(max);
    }
}
