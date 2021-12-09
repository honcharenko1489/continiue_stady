package enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        WeekDays w = WeekDays.FRIDAY;
        WeekDays w1 = WeekDays.MONDAY;
        WeekDays w2 = WeekDays.FRIDAY;
   /*     System.out.println(WeekDays.MONDAY.equals(WeekDays2.MONDAY));
        WeekDays w13 = WeekDays.valueOf("MONDA");*/
       // System.out.println(w13);
        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("so-so"),
    WEDNESDAY("not bad"),
    THURSDAY("more batter"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

    private WeekDays() {
    }

    public String getMood() {
        return mood;
    }

}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to the work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Stay  at home");
                break;
        }
        System.out.println("My feelings today is " + weekDay.getMood());
    }

}
