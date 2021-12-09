package regex;

import java.util.regex.Pattern;

public class Regex6 {
    void checkIp(String ip){
        String regx = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip+" is ok? "+ Pattern.matches(regx, ip));
    }
    public static void main(String[] args) {
    String ip1 = "255.38.192.99";
    String ip2 = "192.263.92.14";
    Regex6 regex6 = new Regex6();
    regex6.checkIp(ip1);
    regex6.checkIp(ip2);

    }
}
