package Array;

public class SubArrays {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        int pair = subarray(num);
        System.out.println(pair);
    }
    public static int subarray(int num[]){
        int pair = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i; j <num.length; j++){
                System.out.print("[");
                for(int k = i ; k <= j ; k++){
                    System.out.print(num[k]+" ");
                }
                System.out.print("]");
                pair++;
            }
            System.out.println();
        }
        return pair;
    }
}
