package Programs;

public class FullDiamond {
	public static void main(String[] args) {
		int star = -1;
		int space = 5;
		for (int i = 1; i <= 10; i++) {
			if(i<=5){
			star = star + 2;
			space--;
		}
			else
			{
				star= star-2;
				space++;
			}
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=star; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
