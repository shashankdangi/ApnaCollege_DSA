package BitManipulation;

public class Check_Number_Power_Of_2 {
    public static void main(String[] args) {
        int n = 4;
       boolean ans =  check(n);
       if(ans){
           System.out.println("Power of 2");
       }else{
           System.out.println("Not power of 2");
       }
    }
    public static boolean check(int n){
        return((n&n-1) == 0);
    }
}
