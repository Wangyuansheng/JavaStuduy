import java.util.Scanner;

public class Exercise4_16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        find(num, 2);
    }

    public static void find(int num, int factor) {
        if (num != 1) {
            //递归结束条件，num=1
            if (num % factor == 0) {
                if (num != factor) System.out.print(factor + ",");
                else System.out.print(factor);  //输出格式
                find(num / factor, factor); //递归调用
            } else {
                factor++;
                find(num, factor);
            }
        }
    }
}

