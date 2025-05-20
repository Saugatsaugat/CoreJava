package pack.advancejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("HIHelloHowAreYou");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }else{
            System.out.println("No match found");
        }
    }
}
