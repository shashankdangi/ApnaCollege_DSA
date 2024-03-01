package BitManipulation;

public class Clear_Last_i_Bits {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        clear2(n,i);
    }
    public static void clear(int n , int i){
        int bitmask = (-1)<<i;
        System.out.println(n&bitmask);
    }
    public static void clear2(int n,  int k){
        int first = n>>k;
        System.out.println(first<<k);
    }
}
