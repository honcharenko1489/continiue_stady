package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
       /* String s1 = "ABCOPABDOP";
        Pattern  pattern1 = Pattern.compile("AB[C-F]OP");*/
        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern  pattern1 = Pattern.compile("abc[^e-g4-7]");*/
        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern  pattern1 = Pattern.compile("abc(e|5)");*/
       /* String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("g6abch$");*/
     /*   String s1 = "abcd abce abc5@abcg6abch";
        Pattern pattern1 = Pattern.compile("\\W");*/
        /*String s1 = "abcd abce abc5@abcg==6abch";
        Pattern pattern1 = Pattern.compile("\\W+");*/
        //String s1 = "by my name Serhii house cinema";
       /* Pattern pattern1 = Pattern.compile("\\w{2}");
        Matcher matcher = pattern1.matcher(s1);*/
       // String s1 = "Hi   dear superman         from    Bangladesh ";
        String s1 = "a abcd abcd4 abvhks adlok8 lls14oqzal";
        Pattern pattern1 = Pattern.compile("[abcd][fgh1-8]");
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position " + matcher.start() + " " + matcher.group());
        }
    }
}
