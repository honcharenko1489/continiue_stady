package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
       /* Scanner scn = new Scanner(System.in);
        System.out.println("Write a fractional number ");
        double i = scn.nextDouble();
        System.out.println("Number is: "+i);*/
       /* System.out.println("Write two numbers ");
        int a=  scn.nextInt();
        int b=  scn.nextInt();
        System.out.println("result a/b is: "+ a/b);
        System.out.println("result remainder a/b is: "+ a%b);*/
      /*  System.out.println("write a few words ");
        String ss = scn.next();
        //String s1 = scn.nextLine();
        System.out.println("Your word is: "+ss);*/
        Scanner sc = new Scanner("Hello my dear friend\nhowe are you?" +
                "\nwhat new  happened?");
       /* String s = sc.next();
        System.out.println(s);
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());*/
     /*   while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }*/
        System.out.println( sc.next().charAt(2));

    }
}
