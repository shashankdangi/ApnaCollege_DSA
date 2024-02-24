package _2DArray;

public class Diagonal_Sum {
    public static void main(String[] args) {
        int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonal(m);
    }

    public static void diagonal(int[][] m){
        int r = m.length;
        int c = m[0].length;
        int sum = 0;
        for(int i = 0; i < r; i++){
            sum += m[i][i];
            sum += m[i][(r-1)-i];
        }
        System.out.println(sum);
    }
}
