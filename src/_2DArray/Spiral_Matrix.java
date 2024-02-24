package _2DArray;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(m);
    }
    public static void spiral(int[][] m){
        int r = m.length;
        int c = m[0].length;

        int count = 0;
        int total = r*c;

        //Initialize
        int sr = 0;
        int er = r-1;
        int sc = 0;
        int ec = c-1;

        while(count < total){

            //first border
            for(int i = sc ; i<=ec ;i++ ){
                System.out.print(m[sr][i]+" ");
                count++;
            }
            sr++;

            //right border
            for(int j = sr; j<=er; j++){
                System.out.print(m[j][ec]+" ");
                count++;
            }
            ec--;

            //bottom border
            for(int i = ec ; i >= sc ; i--){
                System.out.print(m[er][i]+" ");
                count++;
            }
            er--;
            //left border
            for(int j = er; j>=sr ; j--){
                System.out.print(m[j][sc]+" ");
                count++;
            }
            sc++;


        }

    }
}
