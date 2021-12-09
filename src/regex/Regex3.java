package regex;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Regina dubovickaya, SSSR, Moskovia, Shlyapa st, 13, Flat 1"
                + "email: regina@ya.ru, Postcode 9889,  Phone number: +780535384108;"
                + "Kolya Murka, DNR, Doneck, Voinov st, 12, Flat 3"
                + "email: kolya@mail.ru, Postcode 1589,  Phone number: +780535383115;"
                + "Tania Meka, Ukraine, Kozytyn, Sapa st, 81, Flat 14"
                + "email: tania@gmail.com, Postcode 1319,  Phone number: +380955517167.";
        String s2 = "tania@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);
        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
