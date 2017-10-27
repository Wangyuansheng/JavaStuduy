
public class Exercise5_14 {

    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        for (int i = 10; i <= 100000000; i = i + 10) {
            System.out.println(i + "\t\t" + m(i));
        }
    }

    public static String m(double i) {
        double sum = 0;
        for (int j = 1; j <= i; j += 2) {
            sum += 1.0 / (2 * j - 1) - 1.0 / (2 * j + 1);
        }
        return new java.text.DecimalFormat("#.00000").format(4*sum);
    }
}
