package alishev;

import java.util.Scanner;

public class HelloClass {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Write your  old year");
        String age = ss.nextLine();
        switch (age){
            case "zero":
                System.out.println("not you");
                break;
            case "ten":
                System.out.println("school time");
                break;
            case "eighteen":
                System.out.println("university time");
                break;
            default:
                System.out.println("have not true result");
        }

        /*if (age<10){
            System.out.println("your study in school");
        }else if (age>10){
            System.out.println("your in university");
        }*/

        /*  for (int i= 0; i<=15; i++){
          if (i%2==0){
              System.out.println(i +" normal number");
              continue;
          }
          System.out.println(i);
      }*/

        /* int p  = 0;
        while (true){
            if (p==15){
                break;
            }
            System.out.println(p);
            p++;
       }
        System.out.println("Cycle is end");*/
        /*Scanner  sc = new Scanner(System.in);
        int number = sc.nextInt();
        do {
            System.out.println("write number 5");
            number = sc.nextInt();
        }while (number!=5);
            System.out.println(number+" it is number 5");*/




        /* int number  = sc.nextInt();
        while (number!=5){
            System.out.println(number+" is NOT 5");
            number = sc.nextInt();
        }
        System.out.println(" Yep? you write the 5 number");*/
    }
}
