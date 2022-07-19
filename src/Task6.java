import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to check");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++)
            if (numbers[i] % 2 != 0)
                System.out.println("Odd numbers is: " + numbers[i]);
            else if (numbers[i] % 2 == 0)
                System.out.println("Even numbers is: " + numbers[i]);

        int min = numbers[0];
        for (int i = 0; i < size; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("Minimum value: " + min);

        int max = numbers[0];
        for (int i = 0; i < size; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("Maximum value: " + max);

        for (int i = 0; i < size; i++)
            if ((numbers[i] % 3 == 0) || (numbers[i] % 9 == 0))
                System.out.println("Numbers which divisible by 3 and 9: " + numbers[i]);

        for (int i = 0; i < size; i++)
            if ((numbers[i] % 5 == 0) || (numbers[i] % 7 == 0))
                System.out.println("Numbers which divisible by 5 and 7: " + numbers[i]);
    }
}

