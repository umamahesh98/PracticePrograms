package Programs;
import java.util.Scanner;

class NumberPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int number = sc.nextInt();
		System.out.println("The entered number is " + number);
		sc.close();

	}
}