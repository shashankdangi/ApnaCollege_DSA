package Array;

public class Search_In_RotatedSortedArray_33 {
    public static void main(String[] args) {
        int num[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = idx(num, target);
        System.out.println(ans);
    }
    public static int idx(int[] num , int target){
        int start = num[0];
        int end = num.length-1;

        for(int i = 0; i<num.length; i++){
            if(num[i] < start){
                start = i;
            }
        }
        int index = BinarySearch(num, target, start, end);
        if(index != -1){
            return index;
        }else {
            end = start-1;
            start = 0;
            index = BinarySearch(num, target, start, end);

            if(index != -1){
                return index;
            }else{
                return -1;
            }

        }



    }
    public static int BinarySearch(int num[], int target, int start , int end){
        int i = start;
        int j = end;
        int mid = 0;
        while(i<=j){
             mid = (i+j)/2;
            if(num[mid] == target){
                return mid;
            }else if (num[mid] < target){
                j = mid - 1;
            }else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
