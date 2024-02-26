package _2DArray;

public class Question1 {
    public static void main(String[] args) {
        int[][] a = {{4,7,7},{8,8,7}};
        print7(a);
    }
    //Brute force approach
    public static void print7(int[][] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j< a[0].length; j++){
                if(a[i][j] == 7){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
