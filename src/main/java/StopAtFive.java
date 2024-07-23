import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
        System.out.println("Give a number:");
        int n = in.nextInt();
        if (n == 5) break;
        }
    }
}
