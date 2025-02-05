public class searchChar {

    public static int firstOccurence(String str, char ch){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "geegsforgeeks";
        char ch = 'k';
        System.out.println(firstOccurence(s, ch));
    }
}
