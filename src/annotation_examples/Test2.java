package annotation_examples;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
    Class xiaomiClass = Class.forName("annotation_examples.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 =(SmartPhone) annotation1;
        System.out.println("Annotation  info for xiaomi class"
        + sm1.OS()+  "  , "+ sm1.earOfCompanyCreation());
        Class iphoneClass = Class.forName("annotation_examples.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 =(SmartPhone) annotation2    ;
        System.out.println("Annotation  info for iphone class"
                + sm2.OS()+  "  , "+ sm2.earOfCompanyCreation());
    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int  earOfCompanyCreation ()default 2006;

}
@SmartPhone(OS = "Android", earOfCompanyCreation = 2012)
class Xiaomi{
    String model;
    double price;
}
@SmartPhone(OS = "IOS", earOfCompanyCreation = 1996)
class Iphone{

}
