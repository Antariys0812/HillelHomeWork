package hw15;

public class Forecast implements Advise {
    @Override
    public void advise(Day day){
        switch (day) {
            case Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THUSDAY: {
                System.out.println("Sleep well!");
                break;
            }
            case Day.FRIDAY: {
                System.out.println("Happy Friday!");
                break;
            }
            case Day.SATURDAY, Day.SUNDAY: {
                System.out.println("Go for a walk!");
                break;
            }
        }
    }

}
