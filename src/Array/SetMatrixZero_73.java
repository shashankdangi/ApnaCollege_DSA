package Array;

import java.util.Arrays;

public class SetMatrixZero_73 {
    public static void main(String[] args) {
        int[][] n = {{1,1,1,},{1,0,1},{1,1,1}};
        setMatrix(n);
    }
    public static void setMatrix(int[][] n){
        int[] m = new int[n[0].length];
        for(int i = 0; i<n.length; i++){
            for(int j = 0; j<m.length; j++){
                if(n[i][j] == 0){
                    m[j] = 1;
                }
            }
        }

    }
}
