package _2DArray;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int row = matrix.length;
        int col = matrix[0].length;

        //Scanner
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i< row ; i++){
            for(int j = 0; j< col ; j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        //output
        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
