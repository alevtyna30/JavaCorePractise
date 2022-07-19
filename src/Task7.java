public class Task7 {
    static void printGeometricProgression(int a, int r, int n) {
        int value;
        for (int i = 0; i < n; i++) {
            value = a * (int)Math.pow(r, i);
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int r = 2;
        int n = 7;
        printGeometricProgression(a, r, n);
    }
}

