package Programs;

public class Operators {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		String s1 = "Uma";
		int c = a | b;
		System.out.println(c);
		Operators obj = new Operators();
		int result = obj.AND(a, b);
		System.out.println("The result is " + result);
		double d1 = obj.XOR(a, b);
	}

	public int AND(int x, int y) {
		int z = x & y;
		return z;
	}

	public double XOR(int a, int b)
	{
		int g = a^b;
		System.out.println(g);
		return g;
		
	}

	
	

}
