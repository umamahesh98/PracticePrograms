package Programs;

import java.util.Scanner;

public class FunctionCalling {

	public static void main(String[] args) {

		numberOnly();
	}

	public static void numberOnly() {

		
		try {
			System.out.println("Enter a  number");
			Scanner sc = new Scanner(System.in);
			long f1 = sc.nextLong();
			System.out.println(f1);
			System.out.println("The entered number is "+f1);
			System.out.println("Thank you for entering a number");
			sc.close();
		} catch (Exception e1) {
			System.out.println("Pls enter a number only");
			numberOnly();
		}
	}
}
