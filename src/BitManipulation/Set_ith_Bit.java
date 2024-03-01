package BitManipulation;

public class Set_ith_Bit {
    public static void main(String[] args) {
        int i = 10;
        int k = 2;
        setBit(i,k);
    }
    public static void setBit(int i , int k){
        int bit = 1 << k;
        System.out.println(i|bit);
    }
}
