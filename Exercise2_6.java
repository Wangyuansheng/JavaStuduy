import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] arg){
			System.out.print("Enter a number between 0 and 1000:  ");
		 	Scanner in = new Scanner(System.in); 
			int num = in.nextInt();
			int digitsSum = num/100 +num%10 + (num/10-num/100*10); 
			System.out.println("The sum of the digits "+digitsSum);
	}
}
