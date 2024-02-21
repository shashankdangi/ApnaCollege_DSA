package Array;

public class Trapping_Rainwater {
    public static void main(String[] args) {
        int num[] = {4,2,0,3,2,5};
        int ans = maxWater(num);
        System.out.println(ans);
    }
    public static int maxWater(int num[]){
        //calculate left max boundary
        int leftMax[] = new int[num.length];

        leftMax[0] = num[0];
        for(int i = 1; i < num.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], num[i]);
        }

        //calculate right max boundary
        int rightMax[] = new int[num.length];

        rightMax[num.length-1] = num[num.length-1];
        for(int i = num.length-2; i>= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], num[i]);
        }

        //loop
        //waterLevel = min(leftmax, rightMax) - height;
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            int max = Math.min(leftMax[i], rightMax[i]) - num[i];
            sum += max;
        }

        return sum;

    }
}
