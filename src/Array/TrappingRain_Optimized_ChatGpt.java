package Array;

public class TrappingRain_Optimized_ChatGpt {
    public static void main(String[] args) {
        int num[] = {4,2,0,3,2,5};
        maxWater(num);
    }
    public static void maxWater(int num[]){
        int left = 0;
        int right = num.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while(left < right){
            if(num[left] < num[right]){
                if(num[left] >= leftMax){
                    leftMax = num[left];
                }else {
                    water += leftMax - num[left];
                }
                left++;
            }else{
                if(num[right] >= rightMax){
                    rightMax = num[right];
                }else{
                    water += rightMax - num[right];
                }
                right--;
            }
        }
        System.out.println(water);
    }
}
