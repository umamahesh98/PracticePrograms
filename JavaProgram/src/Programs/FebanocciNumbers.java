package Programs;

import java.util.*;

public class FebanocciNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of number youn want");
		int a = 0;
		int b = 1;
		int n = sc.nextInt();
		if (n > 0) {
			
				System.out.println(a);
				System.out.println(b);
			for(int i =1;i<=n-2;i++)
			{
				
				
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			} 
		}
			else {
				System.out.println("Enter a valid number");
			}
	

	}

}
