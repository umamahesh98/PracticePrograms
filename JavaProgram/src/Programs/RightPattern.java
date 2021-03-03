package Programs;

public class RightPattern {
	public static void main(String[] args) {
		int star = 0;
		int space = 4;
		for (int k = 1; k < 5; k++) {
			space = space - 1;
			star++;
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
