import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your password");
        String inputPassword = scanner.next();
        String rightPassword = "octopus";
        String close = "quit";
        if (inputPassword.equals(rightPassword)) {
            System.out.println("Welcome");
            scanner.close();
        } else if (inputPassword.equals(close)){
            scanner.close();
        } else {
            System.out.println("Try again");
        }
    }
}
