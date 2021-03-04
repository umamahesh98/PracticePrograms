package com.org.tech;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Batsman1 {
	String name;
	int runScored;
	int centuries;
	int halfCenturies;
	int ballsFaced;
	int fours;
	int sixes;

	public void setData(String name, int runScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
	
		this.name = name;
	
		this.runScored = runScored;
		
		this.centuries = centuries;
	
		this.halfCenturies = halfCenturies;
		
		this.ballsFaced = ballsFaced;
		
		this.fours = fours;
		
		this.sixes = sixes;
	}

	public float getStrikeRate() {
		
		float strikeRate = ((runScored * 100) / ballsFaced);
		
		return strikeRate;
	}

	public int getRunsScoredInBoundaries() {
		int boundaries = 4 * fours + 6 * sixes;
		return boundaries;
	}

}

public class BatsmanMain1 {
	public static void main(String[] args) {
		Batsman1 b1 = new Batsman1();
		b1.setData("Umamahesh", 394, 1, 3, 123, 12, 23);
		System.out.println(b1.getStrikeRate());

		System.out.println(b1.getRunsScoredInBoundaries());
	}
}
