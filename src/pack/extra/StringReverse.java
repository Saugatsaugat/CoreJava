package pack.extra;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ReverseString";
//        StringBuilder reversed = new StringBuilder(str);
//        reversed.reverse();
//        System.out.println(reversed);

        String reverseStr = "";
        for(int i =0; i<str.length(); i++){
            reverseStr = str.charAt(i) + reverseStr;
        }
        System.out.println(reverseStr);
    }
}
