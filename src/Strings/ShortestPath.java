package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "wneenesennn";
        SortPath(path);
    }
    public static void SortPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'w'){
                x--;
            }else if(path.charAt(i) == 's'){
                y--;
            }else if(path.charAt(i) == 'n'){
                y++;
            }else{
                x++;
            }
        }
        int sp = (int)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println(sp);
    }
}
