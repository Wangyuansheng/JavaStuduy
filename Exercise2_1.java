import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] arg){
		System.out.print("Enter a degree in Celsius: ");
		Scanner in = new Scanner(System.in); 
		int celsius =in.nextInt();
		double fahrenheit = (9.0/5)*celsius +32;
		System.out.print(celsius+" Celsius is "+fahrenheit+" Fahrenheit");
	}
}
