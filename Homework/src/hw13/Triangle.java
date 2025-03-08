package hw13;

public class Triangle implements Area {
    int a=10; //сторона трикутника
    int h=15;//висота трикутника

    @Override
    public double area(){
        return 0.5*a*h;
    };
}
