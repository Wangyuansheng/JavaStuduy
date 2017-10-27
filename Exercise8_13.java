import java.util.Scanner;

public class Exercise8_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int r = input.nextInt();
        int c = input.nextInt();
        double[][] a = new double[r][c];
        System.out.println("Enter the array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = input.nextDouble();
                if (j == c - 1) input.nextLine();
            }
        }
        Location location = locateLargest(a);
        System.out.println("The location of the largest element is "
                + location.getMaxValue()
                + " at (" + location.getRow() + "," + location.getColumn() + ")");
    }

    public static Location locateLargest(double[][] a) {
        return new Location(a);
    }

}

class Location {

    //    public int row;
//    public int column;
//    public  double maxValue;
    private int row;
    private int column;
    private double maxValue;

    Location() {

    }

    Location(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public double getMaxValue() {
        return maxValue;
    }
}