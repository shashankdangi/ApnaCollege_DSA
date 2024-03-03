package BitManipulation;

public class Count_Set_bit_In_Number {
    public static void main(String[] args) {
        int n = 10;
        countBits(n);
    }
    public static void countBits(int n){
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
           n =   n>>1;
        }
        System.out.println(count);
    }
}
