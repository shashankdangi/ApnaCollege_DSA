package BitManipulation;

public class Check_Odd_Even {
    public static void main(String[] args) {
        int n = 11 ;
        oddEven(n);
    }
    public static void oddEven(int n){
        if((n&1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
