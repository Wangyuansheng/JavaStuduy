import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise9_19 {

    public static void main(String[] args) throws Exception {
        File file = new File("Exercise9_19.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(0);
        }

        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            output.print((int) (Math.random() * 100) + " ");
        }
        output.close();

        Scanner scanner = new Scanner(file);
        int[] number = new int[100];
        int i = 0;
        while (scanner.hasNext()) {
            number[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
        Arrays.sort(number);
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + " ");
        }

    }

}
