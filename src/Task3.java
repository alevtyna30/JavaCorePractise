public class Task3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        for (int i = 0; i <= 10; i++) {
            int randomValue = (int)(Math.random() * (max - min + 1) + min);
            System.out.println(" " + randomValue);
        }
    }
}

