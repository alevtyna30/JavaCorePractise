import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type something");
        for (int i = 0; true; i++) {
            StringBuilder input = new StringBuilder(sc.nextLine());
            input.reverse();
            System.out.println("Reverse: " + input.toString());
        }
    }
}
