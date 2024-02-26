package _2DArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] m= {{11,12,13},{21,22,23}};
        transpose(m);
    }
    public static void transpose(int[][] m){
        int r = m.length;
        int c = m[0].length;
        int[][] n = new int[c][r];
        for(int i = 0 ; i<r; i++){
            for(int j = 0; j<c;j++){
                n[j][i] = m[i][j];
            }

        }
        for(int i = 0 ; i<n.length; i++){
            for(int j = 0; j<n[0].length; j++){
                System.out.print(n[i][j] +" ");
            }
            System.out.println();
        }
    }
}
