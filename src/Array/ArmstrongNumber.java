package Array;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1634;
        isArmstrong(num);
    }
    public static void isArmstrong(int num){
        int count = 0;
        String s = Integer.toString(num);
        count = s.length();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int number = s.charAt(i) - '0';
            sum += Math.pow(number, count);
        }
        if(sum == num){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
