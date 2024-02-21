package Array;

public class Max_Subarray_Sum_PrefixSum {
//    Prefix Sum Concept
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSum(num);
    }
    public static void maxSum(int num[]){
        int max = Integer.MIN_VALUE;
        int prefixArray[] = new int[num.length];

        prefixArray[0] = num[0];
        //calculate Prefix Array
        for(int i = 1; i<prefixArray.length; i++){
            prefixArray[i] =  prefixArray[i-1] + num[i];
        }

        //max sub array
        for(int i = 0; i < num.length; i++){
            for(int j = i ; j<num.length; j++){
                int sum = (i == 0) ? prefixArray[j] : prefixArray[j]-prefixArray[i-1];
                max = Math.max(max,sum);;
            }
        }

        System.out.println(max);
    }

}
