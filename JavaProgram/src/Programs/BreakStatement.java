package Programs;

public class BreakStatement {
	public static void main(String[] args) {
		for (int a = 1; a < 2; a++) {
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					break;
				}
				System.out.println("Techouts");
			}
		}
	}

}
