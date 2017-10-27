import java.util.Scanner;

public class Exercise6_21 {

    public static void main(String[] args) {
        System.out.print("Enter the number of balls to drops: ");
        Scanner scan = new Scanner(System.in);
        int numOfBalls = scan.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int numOfSlots = scan.nextInt();
        scan.close();

        int[] slots = new int[numOfSlots];  //一个槽球的个数
        char[][] way = new char[numOfBalls][numOfSlots];    //每个球的路径

        /**打印路径并生产slots[]*/
        System.out.println();
        for (int i = 0; i < numOfBalls; i++) {
            int Right = 0;  //记录路径中R的数量
            for (int j = 0; j < numOfSlots-1; j++) {    //注意！钉子数是numOfSlots-1次
                if (Math.random()<0.5) {    //随机产生R or L
                    way[i][j] = 'R';
                    Right++;
                } else {
                    way[i][j] = 'L';
                }
                System.out.print(way[i][j]);
            }
            System.out.println();
            slots[Right]++;
        }

        /**根据slots[]的结果对print矩阵赋值*/
        char print[][] = new char[numOfBalls][numOfSlots];
        for (int i = 0; i < numOfSlots; i++) {
            for (int k = 0; k < numOfBalls; k++) {
                print[k][i] = ' ';
            }
            for (int j = 0; j < slots[i]; j++) {
                print[j][i] = '0';
            }
        }

        /**输出print矩阵*/
        System.out.println();
        int flag = 0;
        for (int i = numOfBalls - 1; i >= 0; i--) {
            if (flag == 0) {    //找到第一个非空的字符，如果有退出本层循环进入打印循环，并把flag改为1
                for (int j = 0; j < numOfSlots; j++) {
                    if (print[i][j] == '0') {
                        flag = 1;
                        break;
                    }
                }
            }

            if (flag == 1) {    //打印第i行
                for (int j = 0; j < numOfSlots; j++) {
                    System.out.print(print[i][j]);
                }
                System.out.println();
            }
        }

        for (int i = 0; i < numOfSlots; i++) {
            System.out.print(slots[i]+" ");
        }
    }

}