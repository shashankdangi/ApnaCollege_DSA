package Array;

import java.util.HashSet;

public class Contain_Duplicate_217 {
    public static void main(String[] args) {
        int num[] = {1,2,3,1};
        boolean ans = containsDuplicate(num);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int num[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<num.length; i++){
            if(set.contains(num[i])){
                return true;
            }else{
                set.add(num[i]);
            }
        }
        return false;
    }
}
