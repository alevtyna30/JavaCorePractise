import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int i, sum = 0, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to sum");
        int n = sc.nextInt();
        for(i = 0; i < n; i++)
        {
            System.out.print("Enter the number: ");
            z = sc.nextInt();
            sum=sum+z;
        }
        System.out.println("The sum is: "+sum);
    }
}


