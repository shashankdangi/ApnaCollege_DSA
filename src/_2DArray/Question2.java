package _2DArray;

public class Question2 {
    public static void main(String[] args) {
        int[][] m = {{1,4,9},{11,4,3},{2,3,3}};
        int sum = 0;
        for(int i = 0 ; i<m[0].length ; i++){
            sum += m[1][i];
        }
        System.out.println(sum);
    }

}
