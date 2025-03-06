package hw11;

public class Person {
    private String firstName;
    private int age;
    private String profession;

    public Person(String firstName, int age, String profession) {
        this.firstName = firstName;
        this.profession = profession;
        this.age = age;

    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return
                "Ім'я: " + firstName +
                        ", Вік: " + age +
                        ", Професія: " + profession;
    }
}
