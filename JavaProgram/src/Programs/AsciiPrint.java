package Programs;

import java.util.*;

public class AsciiPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System hi = new System();
		System.out.println("Enter any character");
		char n = sc.next().charAt(0);
		System.out.println("The ASCII value of " + n + " Is " + (int) n);
		
	}
}
