package BatsmanPrograms;

class Espncricinfo {
	private final int SIZE = 50;
	private Batsman[] batsmens = new Batsman[SIZE];
	private int noOfBatsman;

	public Batsman[] getBatsmans() {
		return batsmens;
	}

	public int getNoOfBatsmen() {
      return noOfBatsman;
	}

	public int addbatsman(int id,String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		if (noOfBatsman < (SIZE - 1)) {
			Batsman obj = new Batsman(id,name,runsScored, centuries, halfCenturies, ballsFaced,fours,
					 sixes);
			noOfBatsman++;
			return obj.getId();
		} else {
			return 0;
		}

	}

	public Batsman updateBatsmanStats(int id, int runsScored, int fours, int sixes, int ballsFaced) {
     for(int i = 0;i<batsmens.length;i++)
     {
    	 if(batsmens[i].getId()==id)
    	 {
    		 batsmens[i].setBallsFaced(ballsFaced);
    		 batsmens[i].setFours(fours);
    		 batsmens[i].setSixes(sixes);
    		 batsmens[i].setRunsScored(runsScored);
    		 return  batsmens[i];
    		 
    	 }
    	 
     }
     return null;
	}
	public Batsman getBatsman(int batsmanId) {

	for (int i = 0; i < batsmens.length; i++) {

		if (batsmanId == batsmens[i].getId()) {
			return batsmens[i];
		}
	}
	return null;
}

}
public class Batsman3
{
	public static void main(String[] args)
	{
		Espncricinfo info = new Espncricinfo();
		info.getBatsmans();
		System.out.println(info.getNoOfBatsmen());
		info.addbatsman(12, "uma", 34, 3, 2, 123, 34, 3);
		System.out.println(info.getNoOfBatsmen());
		info.updateBatsmanStats(12, 34, 2, 4, 25);
	}
}

