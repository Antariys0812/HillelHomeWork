package hw11;

public class RunPerson {
    public static void main(String[] args) {
        Person pr1 = new Person("John", 30, "Інженер");
        Person pr2 = new Person("Mary", 25, "Вчитель");
        Person pr3 = new Person("Bob", 35, "Лікар");
        Person pr4 = new Person("Alice", 28, "Архітектор");

        System.out.println("1. " + pr1);
        System.out.println("   " + pr2);
        System.out.println("   " + pr3);

        System.out.println();
        System.out.println("2. " + pr4);
        System.out.println("   (Після оновлення професії)");
        pr4.setProfession("Дизайнер");
        System.out.println("   " + pr4);

    }
}
