package Programs;

import java.util.*;

public class Switch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any day number");
		int dayNumber= sc.nextInt();
		switch (dayNumber)
		{
			case 1:
				System.out.println("The day is monday");
			   break;
			case 2:
				System.out.println("The day is tuesday");
			    break;
			case 3:
				System.out.println("The day is wednesday");
			    break;
			case 4:
				System.out.println("The day is Thrusday");
			    break;
			case 5:
				System.out.println("The day is friday");
			    break;
			case 6:
				System.out.println("The day is saturday");
			    break;
			case 7:
				System.out.println("The day is sunday");
			    break;
		}
		
	}

}
