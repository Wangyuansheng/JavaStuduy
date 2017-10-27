
public class Exercise4_44 {

    public static void main(String[] args) {
        final int TIMES = 1000000;
        int numOfHits = 0;

        for (int i = 0; i < TIMES; i++) {
            double x = Math.random() * 2.0 - 1;
            double y = Math.random() * 2.0 - 1;
            if (x < 0) {    //区域1
                numOfHits++;
            } else {        //区域3
                if (x > y && y > 0) numOfHits++;
            }
        }

        System.out.print("The probability of falling into an odd-numbered region is "+(double) numOfHits / TIMES);
    }
}
