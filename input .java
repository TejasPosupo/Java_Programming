import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter anything: ");
        String input = scanner.nextLine();

        System.out.println("Your input is " + input);
    }
}
