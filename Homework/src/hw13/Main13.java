package hw13;

public class Main13 {
    public static void main(String[] args) {

    Circle kolo = new Circle();
    Triangle trykutnyk = new Triangle();
    Square kvadrat = new Square();
    double total = 0d;
    Area[] myArray = {kolo, trykutnyk, kvadrat};

    for (int i = 0; i < myArray.length; i++) {
        total += myArray[i].area();
    }
    System.out.println(total);
}
}
