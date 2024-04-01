package MixedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J_RegEx {
    public static void main(String[] args) {
        String str = "hello world";
        Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
