package _2DArray;

public class Search_In_SortedMatrix {
    public static void main(String[] args) {
        int[][] m = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 48;
        boolean ans = Search(m,key);
        System.out.println(ans);
    }

    //method 2
    public static boolean staricase(int[][] m , int key){
        int row = 0;
        int col = m[0].length - 1;

        while(row < m.length && col >= 0){
            if(m[row][col] == key){
                return true;
            }

            if(key < m[row][col]){
                col--;
            }else{
                row++;
            }
        }

        return false;
    }




    //method 1
    public static  boolean Search(int[][] m , int key){
        for(int i = 0; i<m.length; i++){
            int ans = BinarySearch(m[i], key);
            if(ans == 1)
                return true;

        }
        return false;
    }
    public static int BinarySearch(int[] m , int key){
        int i = 0;
        int j = m.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(m[mid] == key){
                return 1;
            }
            if(m[mid] < key){
                i = mid + 1;
            }else{
                j = mid -1;
            }

        }
        return -1;
    }
}
