package hw6;

public class Main6 {
    public static void main(String[] args) {

        int n = 6;
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
            System.out.println(i+") Num is "+i+", "+"sum is "+result);
        }
        System.out.println("Sum of numbers is "+result);
    }
}
