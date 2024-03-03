package BitManipulation;

public class Clear_Range_Of_Bits {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int j = 7;
        clearBit(n,i,j);
    }
    public static void clearBit(int n ,int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int ans = n & (a|b);
        System.out.println(ans);
    }
}
