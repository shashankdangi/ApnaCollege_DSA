package BitManipulation;

public class Clear_ith_bit {
    public static void main(String[] args) {
        int i = 10;
        int k = 1;
        clear(i,k);
    }
    public static void clear(int i, int k){
        int bit = ~(1 << k);
        System.out.println(i&bit);
    }
}
