package hw15;

public class ForecastRun {
    public static void main(String[] args) {

        Forecast frc = new Forecast();

        frc.advise(Day.MONDAY);
        frc.advise(Day.TUESDAY);
        frc.advise(Day.WEDNESDAY);
        frc.advise(Day.THUSDAY);
        frc.advise(Day.FRIDAY);
        frc.advise(Day.SATURDAY);
        frc.advise(Day.SUNDAY);

    }
}
