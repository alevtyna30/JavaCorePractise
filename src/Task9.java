import java.io.IOException;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws IOException {
        boolean isExit = false;
        int spaceCount = 0;
        Scanner scan = new Scanner(System.in);
        while (!isExit) {
            System.out.print("Enter symbol: ");
            char[] line = scan.nextLine().toCharArray();
            String st = String.copyValueOf(line);
            spaceCount += st.split(" ").length - 1;
            if (st.contains(".")) {
                break;
            }
        }
        System.out.println("Amount of space is: " + spaceCount);
    }
}






//            for (char c : line) {
//                if (c == ' ') {
//                    spaceCount++;
//                } else if (c == '.') {
//                    isExit = true;
 //                   break;


