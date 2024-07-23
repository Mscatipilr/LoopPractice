import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
