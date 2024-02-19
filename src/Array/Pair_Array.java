package Array;

public class Pair_Array {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12};
       int pair =  pairs(num);
        System.out.println("Total number of pairs : " + pair);
    }
    public static int pairs(int num[]){
        int total = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                System.out.print("("  + num[i] + ","+ num[j]+") ");
                total++;
            }
            System.out.println();
        }
        return total ;
    }
}
