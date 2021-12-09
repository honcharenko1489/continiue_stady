package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String ss = "13761367871778719812223;" +
                    "12344321456776541222321;" +
                    "89713489787989023131220";
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher  matcher = pattern.matcher(ss);
       /* String newSS = matcher.replaceAll("$5/$6 $1 $2 $4 ($7)");
        System.out.println(newSS);*/
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
