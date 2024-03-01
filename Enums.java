public class Enums {
  
public static void main(String [] args){

    Day today = Day.MONDAY;
    System.out.println(today);

    switch (today){
        case MONDAY:
            System.out.println("Today is Monday");
            break;
        case TUESDAY:
            System.out.println("Today is Tuesday");
            break;
        case SATURDAY:
            System.out.println("Today is Saturday");
            break;
        default:
            System.out.println("Today is not a weekday");
    }
    for (Day day : Day.values()){
        System.out.println(day);
    }

}

// Define an enum for days of the week
public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
}