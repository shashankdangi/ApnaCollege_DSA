package BitManipulation;

public class Fast_Exp {
    public static void main(String[] args) {
        exp(2,10);
    }
    public static void exp(int a , int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                ans *= a;
            }
            a *= a;
            n = n>> 1;
        }
        System.out.println(ans);
    }
}
