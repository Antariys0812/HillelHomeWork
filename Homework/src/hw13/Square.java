package hw13;

public class Square implements Area{
    int a=15;//сторона квадрата

    @Override
    public double area(){
        return a*a;
    };
}
