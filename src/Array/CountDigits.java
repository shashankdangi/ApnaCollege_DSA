package Array;

public class CountDigits {
    public static void main(String[] args) {
        int num = 373;
        count(num);
    }
    public static void count(int num){
        int n = num;
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit != 0 && n % digit == 0){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
