import java.util.*;

/**
 * @author 王源盛
 * @class 软件工程1603
 * @studentNum 20161003271
 */

public class Exercise6_5 {

    public static void main(String[] args) {
        System.out.print("Enter ten numbers:");
        Scanner in = new Scanner(System.in);
        Integer[] num = new Integer[10];
        for (int i = 0; i < 10; i++) {
            num[i] = in.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    j = ++i;
                }
            }
            list.add(num[i]);
        }
        for (Integer result : list) {
            System.out.print(result + " ");
        }

    }

}
