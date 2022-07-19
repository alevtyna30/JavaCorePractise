import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name");
        String name = input.next();
        System.out.println("What's up "+ name +"?");
        input.close();
    }
}
