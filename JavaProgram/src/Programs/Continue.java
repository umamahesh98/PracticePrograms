package Programs;

public class Continue {

	public static void main(String[] args) {
		for (int a = 1; a < 2; a++) {
			for (int i = 1; i <= 3; i++) {
				if (i == 2) {
					continue;
				}
				System.out.println("Techouts");
			}
		}
	}
}
