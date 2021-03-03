package Programs;

public class Constructor {
	int a;
	int b;
	
	Constructor(int x, int y)
	{
		this.a = x;
		this.b= y;
	}
public static void main(String[] args)
{
	Constructor c1 = new Constructor(12,15);
	Constructor c2 = new Constructor(34,56);
	c1.disp();
	c2.disp();
}

public void disp()
{
	
	System.out.println("the value of a is "+ a);
	System.out.println("the value of a is "+ b);
}
}
