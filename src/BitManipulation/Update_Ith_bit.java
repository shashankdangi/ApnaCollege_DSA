package BitManipulation;

public class Update_Ith_bit {
    public static void main(String[] args) {
        int i = 10;
        int k = 1;
        int operation = 0;
        //Method 1
        update(i,k,0);

        //Method 2
        update2(i,k,0);
    }

    public static void update2(int i ,int k  , int operation){
        i = clear(i,k);
        int bit = operation << k;
        System.out.println(i|bit);
    }
    public static void update(int i , int k , int operation){
        int ans = 0;
        if(operation == 1){
           ans =  set(i,k);
        }else{
            ans = clear(i,k);
        }
        System.out.println(ans);
    }
    //set
    public static int set(int i , int k){
        int bit = 1 << k;
        return (i|bit);
    }

    //clear
    public static int clear(int i , int k){
        int bit = ~(1 << k);
        return (i&bit);
    }


}
