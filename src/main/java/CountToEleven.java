import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int n = in.nextInt();
        while (n <= 11) {
            System.out.println(n);
            n++;
        }

    }
}
