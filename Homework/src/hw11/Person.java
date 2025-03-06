package hw11;

public class Person {
    private String firstName;
    private int age;
    private String profession;

    public Person(String firstName, int age, String newValue) {
        this.firstName = firstName;
        this.profession = newValue;
        this.age = age;

    }

    public void setProfession(String newValue) {
        this.profession = newValue;
    }

    @Override
    public String toString() {
        return
                "Ім'я: " + firstName +
                        ", Вік: " + age +
                        ", Професія: " + profession;
    }
}
