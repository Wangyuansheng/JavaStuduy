import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise9_16 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        StringBuffer stringBuffer = new StringBuffer();
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = s1.trim();
            if (s2.startsWith("{")) {   //去掉{前多余的空格
                stringBuffer.append(s2);
            } else {
                stringBuffer.append(s1);
            }
            stringBuffer.append("\r\n");
        }
        String content = stringBuffer.toString().replace("\r\n{", " {");
//        System.out.println(content);
        PrintWriter output = new PrintWriter(file);
        output.print(content);
        scanner.close();
        output.close();
    }
}
