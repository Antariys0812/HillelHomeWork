package hw13;

public class Circle implements Area {

    int radius=10;
    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    };
}
