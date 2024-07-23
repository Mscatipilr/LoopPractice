import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int multiplier = 1;
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        while (multiplier <= 10) {
            System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
            multiplier++;

        }

    }
}
