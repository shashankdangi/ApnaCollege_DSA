package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "abbcccddddeeeee";
        compress(str);
    }
    public static void compress(String str){
        StringBuilder s = new StringBuilder("");
        int count = 1;
        int i = 0;
        for( i = 1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                s.append(str.charAt(i-1));
                s.append(count);
                count = 1;
            }
        }

        //Append the last char
        s.append(str.charAt(i-1));
        s.append(count);
        System.out.println(s);
    }
}
