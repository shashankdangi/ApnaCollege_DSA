package BitManipulation;

public class Get_ith_Bit {
    public static void main(String[] args) {
        int i = 10;
        int k = 3;
        ithBit(i,k);
    }
    public static void ithBit(int i , int k ){
        int ans = i>>(k);
        System.out.println(ans&1);
    }
}
