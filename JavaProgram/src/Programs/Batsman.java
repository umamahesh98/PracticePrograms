package Programs;


class BatsmanDetails {
	String name;
	int runsScored;
	int centuries;
	int halfCenturies;
	int ballsFaced;
	int fours;
	int sixes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public BatsmanDetails(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		super();
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}

	BatsmanDetails() {

	}

}

public class Batsman {
	public static void main(String[] args) {
		BatsmanDetails b1 = new BatsmanDetails();
		b1.setName("Umamahesh");
		b1.setRunsScored(200);
		b1.setBallsFaced(98);
		b1.setCenturies(2);
		b1.setFours(43);
		b1.setSixes(12);
		b1.setHalfCenturies(2);
		
		System.out.println(b1.getBallsFaced());
		System.out.println(b1.getCenturies());
		System.out.println(b1.getFours());
		System.out.println(b1.getHalfCenturies());
		System.out.println(b1.getName());
		System.out.println(b1.getRunsScored());
		System.out.println(b1.getSixes());

	}
}

