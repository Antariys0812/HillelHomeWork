package hw12;

public class Car {
    boolean electricity = false;
    boolean command = false;
    boolean fuel = false;

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

        if (this.electricity && this.command && this.fuel) {
            System.out.println("Car goes brrr");
        }
    }
    private void startElectricity() {
        this.electricity = true;
    }
    private void startCommand () {
        this.command = true;
    }
    private void startFuelSystem () {
        this.fuel = true;
    }
}
