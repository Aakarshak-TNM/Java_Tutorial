// Define an enum named Day with constants representing days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Java_enum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        Day tomorrow = Day.TUESDAY;
        System.out.println(today + "\n" + tomorrow);

    }
}
