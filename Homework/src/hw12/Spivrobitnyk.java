package hw12;

public class Spivrobitnyk {
    private String pib;
    private String posada;
    private String email;
    private String telefon;
    private int age;

    public Spivrobitnyk(String pib, String posada, String email, String telefon, int age) {
        this.pib = pib;
        this.posada = posada;
        this.email = email;
        this.telefon = telefon;
        this.age = age;

    }
    public String getPib() {
        return this.pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPosada() {
        return this.posada;
    }

    public void setPosada(String breed) {
        this.posada = posada;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
