package Strings;

public class ConvertToUppercasae {
    public static void main(String[] args) {
        String str = "hi , i am shashank";
        Capital(str);

    }
    public static void Capital(String str){
        StringBuilder s = new StringBuilder("");
        s.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }else{
                s.append(str.charAt(i));
            }
        }
        System.out.println(s);
    }
}
