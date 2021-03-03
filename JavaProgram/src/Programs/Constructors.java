package Programs;

public class Constructors {
	String name;
	int ID;
	String branch;
	String section;

	Constructors(String name, int iD, String branch, String section) {
		// super();
		this.name = name;
		this.ID = iD;
		this.branch = branch;
		this.section = section;
	}

	public static void main(String[] args) {
		Constructors cons = new Constructors("uma", 14, "CSE", "CSE-d");
		System.out.println(cons.ID);
		System.out.println(cons.section);
		System.out.println(cons.branch);
		System.out.println(cons.name);
	}
}
